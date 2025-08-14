package machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Strategy;

import machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Model.Agent;
import machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Model.Issue;

import java.util.List;
import java.util.Optional;

public class DefaultAssignmentStrategy implements AssignmentStrategy{

    public Optional<Agent> assign(Issue issue, List<Agent> agents){
        return agents.stream()
                .filter((Agent a) -> a.isAvailable() && a.getExpertise().contains(issue.getIssueType()))
                        .findFirst();
    }
}
