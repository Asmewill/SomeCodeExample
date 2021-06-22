package hk.disign.builder.model;

/**
 * Created by jian.shui on 2019/1/8
 * 类描述：请假对象
 */
public class Request {
    private String name;
    private String reason;
    private String days;
    private String groupLeaderInfo;
    private String managerInfo;
    private String departmentHeaderInfo;
    private String customInfo;
    public Request(Builder builder){
         // super();
          this.name=builder.name;
          this.reason=builder.reason;
          this.days=builder.days;
          this.groupLeaderInfo=builder.groupLeaderInfo;
          this.managerInfo=builder.managerInfo;
          this.departmentHeaderInfo=builder.departmentHeaderInfo;
          this.customInfo=builder.customInfo;

    }


    public static class Builder{
        private String name;
        private String reason;
        private String days;
        private String groupLeaderInfo;
        private String managerInfo;
        private String departmentHeaderInfo;
        private String customInfo;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setDays(String days) {
            this.days = days;
            return this;
        }

        public Builder setGroupLeaderInfo(String groupLeaderInfo) {
            this.groupLeaderInfo = groupLeaderInfo;
            return this;
        }

        public Builder setManagerInfo(String managerInfo) {
            this.managerInfo = managerInfo;
            return this;
        }

        public Builder setDepartmentHeaderInfo(String departmentHeaderInfo) {
            this.departmentHeaderInfo = departmentHeaderInfo;
            return this;
        }

        public Builder setCustomInfo(String customInfo) {
            this.customInfo = customInfo;
            return this;
        }
        public Builder newRequest(Request request){
            this.name=request.name;
            this.days=request.days;
            this.reason=request.reason;
            if(request.getGroupLeaderInfo()!=null&&!request.getGroupLeaderInfo().equals("")){
                this.groupLeaderInfo=request.groupLeaderInfo;
            }
            if(request.getManagerInfo()!=null&&!request.getManagerInfo().equals("")){
                this.managerInfo=request.managerInfo;
            }
            if(request.getDepartmentHeaderInfo()!=null&&!request.getDepartmentHeaderInfo().equals("")){
                this.departmentHeaderInfo=request.getDepartmentHeaderInfo();
            }
            return this;
        }

        public Request build(){
            return new Request(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getReason() {
        return reason;
    }

    public String getDays() {
        return days;
    }

    public String getGroupLeaderInfo() {
        return groupLeaderInfo;
    }

    public String getManagerInfo() {
        return managerInfo;
    }

    public String getDepartmentHeaderInfo() {
        return departmentHeaderInfo;
    }

    public String getCustomInfo() {
        return customInfo;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", reason='" + reason + '\'' +
                ", days='" + days + '\'' +
                ", groupLeaderInfo='" + groupLeaderInfo + '\'' +
                ", managerInfo='" + managerInfo + '\'' +
                ", departmentHeaderInfo='" + departmentHeaderInfo + '\'' +
                ", customInfo='" + customInfo + '\'' +
                '}';
    }
}
