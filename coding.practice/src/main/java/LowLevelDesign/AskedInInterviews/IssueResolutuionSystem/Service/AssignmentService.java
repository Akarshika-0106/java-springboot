package LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Service;

import LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Model.Agent;
import LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Model.Issue;
import LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Repository.AgentRepository;
import LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Strategy.AssignmentStrategy;

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
