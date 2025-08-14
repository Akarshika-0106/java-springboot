package machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Service;

import machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Enum.IssueStatus;
import machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Enum.IssueType;
import machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Model.Agent;
import machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Model.Issue;
import machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Repository.IssueRepository;

import java.util.*;
import java.util.stream.Collectors;

public class IssueService {

    private IssueRepository issueRepository;
    private AssignmentService assignmentService;
    private AgentService agentService;

    public IssueService(IssueRepository issueRepository, AssignmentService assignmentService,
                        AgentService agentService){
        this.issueRepository = issueRepository;
        this.assignmentService = assignmentService;
        this.agentService = agentService;
    }

    public synchronized Issue createIssue(String transactionId, String cusEmail, IssueType issueType,
                                          String subject, String description){
        Issue issue = new Issue(UUID.randomUUID().toString(), transactionId, issueType, cusEmail, subject, description);
        issueRepository.save(issue);
        System.out.println("Issue created: "+issue.getId());
        return issue;
    }

    public synchronized void assignIssue(Issue issue){
        Optional<Agent> agent = assignmentService.assign(issue);
        agent.ifPresent(a -> {
            issue.setIssueStatus(IssueStatus.ASSIGNED);
            issue.setAssignedAgentEmail(a.getEmail());
            a.setAvailable(false);
            a.getHistory().add(issue);
        });
    }

    public synchronized void resolveIssue(String issueId, String resolution){
        Issue issue = issueRepository.findById(issueId).orElseThrow();
        issue.setIssueStatus(IssueStatus.RESOLVED);
        issue.setResolution(resolution);
        if(issue.getAssignedAgentEmail() != null){
            agentService.markAvailable(issue.getAssignedAgentEmail());
        }
        System.out.println("Issue resolved: "+issueId);
    }

    public List<Issue> getIssues(Map<String, String> filter) {
        return issueRepository.findAll().stream()
                .filter(i -> filter.getOrDefault("email", i.getCustomerEmail()).equals(i.getCustomerEmail()))
                .filter(i -> filter.getOrDefault("type", i.getIssueType().toString()).equals(i.getIssueType().toString()))
                .collect(Collectors.toList());
    }

    public void retryPendingIssues(){
        List<Issue> pendingIssues = issueRepository.findPending();
        pendingIssues.sort(Comparator.comparingLong(issue -> issue.getCreatedAt()));
        for(Issue issue: pendingIssues){
            assignIssue(issue);
        }
    }

}
