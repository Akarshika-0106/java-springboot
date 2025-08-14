package machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Model;

import machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Enum.IssueStatus;

public class Transaction {
    private String id;
    private IssueStatus issueStatus;

    public Transaction(String id, IssueStatus issueStatus) {
        this.id = id;
        this.issueStatus = issueStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IssueStatus getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(IssueStatus issueStatus) {
        this.issueStatus = issueStatus;
    }
}
