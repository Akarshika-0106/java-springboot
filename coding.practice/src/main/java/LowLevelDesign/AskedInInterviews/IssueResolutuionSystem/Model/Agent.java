package LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Model;

import LowLevelDesign.AskedInInterviews.IssueResolutuionSystem.Enum.IssueType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Agent {
    private String name;
    private String email;
    private Set<IssueType> expertise;
    private List<Issue> history;
    private boolean isAvailable;

    public Agent(String email, String name, List<IssueType> expertise) {
        this.isAvailable = true;
        this.history = new ArrayList<>();
        this.expertise = new HashSet<>(expertise);
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<IssueType> getExpertise() {
        return expertise;
    }

    public void setExpertise(Set<IssueType> expertise) {
        this.expertise = expertise;
    }

    public List<Issue> getHistory() {
        return history;
    }

    public void setHistory(List<Issue> history) {
        this.history = history;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
