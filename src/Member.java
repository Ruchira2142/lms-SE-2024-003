package lms.model;

public class Member {
    private String memberId;
    private String name;
    private int borrowedCount;
    private int maxBorrowLimit;

    public Member(String memberId, String name, int maxBorrowLimit) {
        setMemberId(memberId);
        setName(name);
        this.maxBorrowLimit = maxBorrowLimit;
        this.borrowedCount = 0;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        if (memberId == null || memberId.isBlank()) {
            throw new IllegalArgumentException("Member ID cannot be null or blank.");
        }
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank.");
        }
        this.name = name;
    }

    public int getBorrowedCount() {
        return borrowedCount;
    }

    public int getMaxBorrowLimit() {
        return maxBorrowLimit;
    }

    public void incrementBorrowedCount() {
        if (borrowedCount < maxBorrowLimit) {
            borrowedCount++;
        }
    }

    public void decrementBorrowedCount() {
        if (borrowedCount > 0) {
            borrowedCount--;
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [ID=" + memberId + ", Name=" + name + ", Borrowed=" + borrowedCount + "/" + maxBorrowLimit + "]";
    }
}