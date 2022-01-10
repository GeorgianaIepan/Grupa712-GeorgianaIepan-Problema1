public class Offerte {
    private Integer id;
    private String taskName;
    private Integer hoursSpent;
    private Integer hourBudget;
    private Status status;

    public Offerte(Integer id, String taskName, Integer hoursSpent, Integer hourBudget, Status status) {
        this.id = id;
        this.taskName = taskName;
        this.hoursSpent = hoursSpent;
        this.hourBudget = hourBudget;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Integer getHoursSpent() {
        return hoursSpent;
    }

    public void setHoursSpent(Integer hoursSpent) {
        this.hoursSpent = hoursSpent;
    }

    public Integer getHourBudget() {
        return hourBudget;
    }

    public void setHourBudget(Integer hourBudget) {
        this.hourBudget = hourBudget;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Offerte{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", hoursSpent=" + hoursSpent +
                ", hourBudget=" + hourBudget +
                ", status=" + status +
                '}';
    }
}
