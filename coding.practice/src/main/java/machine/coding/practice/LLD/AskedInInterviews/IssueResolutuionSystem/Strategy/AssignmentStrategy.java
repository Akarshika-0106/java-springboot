package machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Strategy;

import machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Model.Agent;
import machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Model.Issue;

import java.util.List;
import java.util.Optional;

public interface AssignmentStrategy {
    public Optional<Agent> assign(Issue issue, List<Agent> agents);
}
