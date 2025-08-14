package LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Strategy;

import LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Model.Agent;
import LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Model.Issue;

import java.util.List;
import java.util.Optional;

public interface AssignmentStrategy {
    public Optional<Agent> assign(Issue issue, List<Agent> agents);
}
