package LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Service;

import LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Repository.AgentRepository;

public class AgentService {

    private AgentRepository agentRepository;

    public AgentService(AgentRepository agentRepository){
        this.agentRepository = agentRepository;
    }

    public void markAvailable(String email){
        agentRepository.findByEmail(email).ifPresent( a -> a.setAvailable(true));
    }
}
