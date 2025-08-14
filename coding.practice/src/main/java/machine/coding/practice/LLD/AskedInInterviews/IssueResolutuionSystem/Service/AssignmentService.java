package machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Service;

import machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Model.Agent;
import machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Model.Issue;
import machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Repository.AgentRepository;
import machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Strategy.AssignmentStrategy;

import java.util.Optional;

public class AssignmentService {

    private AssignmentStrategy assignmentStrategy;
    private AgentRepository agentRepository;

    public AssignmentService(AssignmentStrategy assignmentStrategy, AgentRepository agentRepository){
        this.assignmentStrategy = assignmentStrategy;
        this.agentRepository = agentRepository;
    }

    public Optional<Agent> assign(Issue issue){
        Optional<Agent> agent = assignmentStrategy.assign(issue, agentRepository.findAll());
        System.out.println("Agent "+agent.get().getName()+" assigned to issue "+issue.getId());
        return agent;
    }
}
