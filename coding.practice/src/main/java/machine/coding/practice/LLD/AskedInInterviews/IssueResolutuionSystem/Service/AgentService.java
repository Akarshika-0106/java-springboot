package machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Service;

import machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Repository.AgentRepository;

public class AgentService {

    private AgentRepository agentRepository;

    public AgentService(AgentRepository agentRepository){
        this.agentRepository = agentRepository;
    }

    public void markAvailable(String email){
        agentRepository.findByEmail(email).ifPresent( a -> a.setAvailable(true));
    }
}
