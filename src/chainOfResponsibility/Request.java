package chainOfResponsibility;

/**
 * Created by kxyu on 2018/8/2
 */
public class Request implements Cloneable{

    private String name;
    private String department;
    private String reason;

    private int day;

    private String groupLeaderInfo;

    private String managerInfo;

    private String departmentHeaderInfo;

    private String customInfo;

   public static class Builder{

        private Request request;

        public Builder(){
                this.request = new Request();
        }

        public Builder setName(String name){
            request.name = name;
            return this;
        }

        public Builder setDepartment(String department){
            request.department = department;
            return this;
        }

        public Builder setDay(int day){
            request.day = day;
            return this;
        }

        public Builder setReason(String reason){
            request.reason = reason;
            return this;
        }

        public Builder setGroupLeaderInfo(String groupLeaderInfo){
            request.groupLeaderInfo = groupLeaderInfo;
            return this;
        }

        public  Builder setManagerInfo(String managerInfo){
            request.managerInfo = managerInfo;
            return this;
        }

        public Builder setDepartmentHeaderInfo(String departmentHeaderInfo){
            request.departmentHeaderInfo = departmentHeaderInfo;
            return this;
        }

        public Builder setCustomInfo(String customInfo){
            request.customInfo = customInfo;
            return this;
        }

        public Request build(){
            return request;
        }

    }

    public String getManagerInfo() {
        return managerInfo;
    }

    public void setManagerInfo(String managerInfo) {
        this.managerInfo = managerInfo;
    }

    public String getDepartmentHeaderInfo() {
        return departmentHeaderInfo;
    }

    public void setDepartmentHeaderInfo(String departmentHeaderInfo) {
        this.departmentHeaderInfo = departmentHeaderInfo;
    }

    public String getCustomInfo() {
        return customInfo;
    }

    public void setCustomInfo(String customInfo) {
        this.customInfo = customInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getReason() {
        return reason;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getGroupLeaderInfo() {
        return groupLeaderInfo;
    }

    public void setGroupLeaderInfo(String groupLeaderInfo) {
        this.groupLeaderInfo = groupLeaderInfo;
    }

    @Override
    protected Request clone() throws CloneNotSupportedException {
       Request cloneRequest = (Request) super.clone();
        return cloneRequest;
    }


    @Override
    public String toString() {
        return "Request [name=" + name + ", reason=" + reason + ", days="
                + day + ", customInfo=" + customInfo + ", groupLeaderInfo="
                + groupLeaderInfo + ", managerInfo=" + managerInfo
                + ", departmentHeaderInfo=" + departmentHeaderInfo + "]";
    }
}
