package codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Service;

import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Enum.IssueType;
import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Model.Agent;
import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Model.Issue;
import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Repository.AgentRepository;

import java.util.List;

public class AdminService {

    private AgentRepository agentRepository;

    public AdminService(AgentRepository agentRepository){
        this.agentRepository = agentRepository;
    }

    public Agent onboardAgent(String email, String name, List<IssueType> expertise){
        Agent agent = new Agent(email, name, expertise);
        agentRepository.save(agent);
        System.out.println("Agent onboarded: "+agent.getName());
        return agent;
    }

    public void viewHistory(Agent agent){
        List<Issue> agentHistory = agent.getHistory();
        for(Issue issue: agentHistory){
            System.out.println("History of Agent "+agent.getName()+": ");
            System.out.println(issue.toString());
        }
    }
}
