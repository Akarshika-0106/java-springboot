package codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Service;

import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Model.Agent;
import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Model.Issue;
import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Repository.AgentRepository;
import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Strategy.AssignmentStrategy;

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
