package codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Repository;

import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Enum.IssueStatus;
import codingpractice.LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Model.Issue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class IssueRepository {
    private final Map<String, Issue> issues = new ConcurrentHashMap<>();

    public void save(Issue issue){
        issues.put(issue.getId(), issue);
    }

    public Optional<Issue> findById(String id){
        return Optional.ofNullable(issues.get(id));
    }

    public List<Issue> findAll(){
        return  new ArrayList<>(issues.values());
    }

    public List<Issue> findPending(){
        return issues.values()
                .stream()
                .filter(i -> i.getIssueStatus() == IssueStatus.PENDING)
                .collect(Collectors.toList());
    }
}
