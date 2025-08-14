package machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Repository;

import machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Model.Agent;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class AgentRepository {

    private final Map<String, Agent> agents = new ConcurrentHashMap<>();

    public void save(Agent agent) {
        agents.put(agent.getEmail(), agent);
    }

    public List<Agent> findAll(){
        return new ArrayList<>(agents.values());
    }

    public Optional<Agent> findByEmail(String email){
        return Optional.ofNullable(agents.get(email));
    }
}
