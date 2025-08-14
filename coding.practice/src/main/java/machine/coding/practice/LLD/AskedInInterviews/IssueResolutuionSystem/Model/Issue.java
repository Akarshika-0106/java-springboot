package machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Model;

import machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Enum.IssueStatus;
import machine.coding.practice.LLD.AskedInInterviews.IssueResolutuionSystem.Enum.IssueType;

import java.time.LocalDateTime;

public class Issue {
    private String id;
    private String transactionId;
    private IssueStatus issueStatus;
    private IssueType issueType;
    private String customerEmail;
    private String assignedAgentEmail;
    private String subject;
    private String description;
    private String resolution;
    private long createdAt;


    public Issue(String id, String transactionId, IssueType issueType, String customerEmail,
                 String subject, String description) {
        this.id = id;
        this.transactionId = transactionId;
        this.issueStatus = IssueStatus.PENDING;
        this.issueType = issueType;
        this.customerEmail = customerEmail;
        this.subject = subject;
        this.description = description;
        this.createdAt = System.currentTimeMillis();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public IssueStatus getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(IssueStatus issueStatus) {
        this.issueStatus = issueStatus;
    }

    public IssueType getIssueType() {
        return issueType;
    }

    public void setIssueType(IssueType issueType) {
        this.issueType = issueType;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getAssignedAgentEmail() {
        return assignedAgentEmail;
    }

    public void setAssignedAgentEmail(String assignedAgentEmail) {
        this.assignedAgentEmail = assignedAgentEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "id='" + id + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", issueStatus=" + issueStatus +
                ", issueType=" + issueType +
                ", customerEmail='" + customerEmail + '\'' +
                ", assignedAgentEmail='" + assignedAgentEmail + '\'' +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                ", resolution='" + resolution + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
