package codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem;

import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Enum.IssueType;
import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Model.Agent;
import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Model.Issue;
import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Repository.AgentRepository;
import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Repository.IssueRepository;
import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Repository.TransactionRepository;
import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Service.AdminService;
import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Service.AgentService;
import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Service.AssignmentService;
import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Service.IssueService;
import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Strategy.AssignmentStrategy;
import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Strategy.DefaultAssignmentStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        IssueRepository issueRepository = new IssueRepository();
        AgentRepository agentRepository = new AgentRepository();
        TransactionRepository transactionRepository = new TransactionRepository();
        AssignmentStrategy assignmentStrategy = new DefaultAssignmentStrategy();
        AgentService agentService = new AgentService(agentRepository);
        AssignmentService assignmentService = new AssignmentService(assignmentStrategy, agentRepository);
        IssueService issueService = new IssueService(issueRepository, assignmentService, agentService);
        AdminService adminService = new AdminService(agentRepository);

        Agent agent1 = adminService.onboardAgent("richard@pp.com", "Richard", List.of(IssueType.MUTUAL_FUND, IssueType.PAYMENT));
        Agent agent2 = adminService.onboardAgent("jared@pp.com", "Jared", List.of(IssueType.GOLD, IssueType.INSURANCE));
        Issue issue1 = issueService.createIssue("txn123", "user1@pp.com", IssueType.PAYMENT, "UPI issue", "Failed UPI");
        Issue issue2 = issueService.createIssue("txn456", "user2@pp.com", IssueType.GOLD, "Refund issue", "Failed Refund");
        Issue issue3 = issueService.createIssue("txn789", "user3@pp.com", IssueType.MUTUAL_FUND, "Refund issue", "Failed Refund");


        assignmentService.assign(issue1);
        assignmentService.assign(issue2);
        assignmentService.assign(issue3);
        Thread.sleep(2000);
        issueService.resolveIssue(issue1.getId(), "Resolved");
        System.out.println("Retrying assignment of pending issue");
        issueService.retryPendingIssues();

        issueRepository.findAll().forEach( i -> System.out.println("IssueId: "+i.getId() + "Issue status: "+
                i.getIssueStatus() + " Agent assigned: "+i.getAssignedAgentEmail()));

        adminService.viewHistory(agent1);
        adminService.viewHistory(agent2);

        System.out.println("==== Filtered Issues for user1@pp.com ====");
        Map<String, String> filterByEmail = new HashMap<>();
        filterByEmail.put("email", "user1@pp.com");
        List<Issue> issuesByEmail = issueService.getIssues(filterByEmail);
        issuesByEmail.forEach(i -> System.out.println(i.getId() + " -> " + i.getIssueStatus() + " -> " + i.getIssueType()));

        System.out.println("==== Filtered Issues for type GOLD ====");
        Map<String, String> filterByType = new HashMap<>();
        filterByType.put("type", "GOLD");
        List<Issue> issuesByType = issueService.getIssues(filterByType);
        issuesByType.forEach(i -> System.out.println(i.getId() + " -> " + i.getIssueStatus() + " -> " + i.getCustomerEmail()));
    }

}
