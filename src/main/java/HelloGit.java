import com.alibaba.fastjson.JSON;

import java.util.ArrayList;

/**
 * Created by fengweizheng on 15/8/20.
 */
class HelloGit {

    public static void main(String[] args) {
        String acrossDay = "1:3";
        int preAfterAtLeast = 0;
        int preAfterAtMost = 0;
        if(acrossDay!=null && acrossDay.length()==3) {
            preAfterAtLeast = Integer.parseInt(String.valueOf(acrossDay.charAt(0)));
            preAfterAtMost = Integer.parseInt(String.valueOf(acrossDay.charAt(2)));
        }
        System.out.println(preAfterAtLeast);
        System.out.println(preAfterAtMost);

        String str = "[{\"beginTime\":\"10:00\",\"endTime\":\"21:00\"},{\"beginTime\":\"21:00\",\"endTime\":\"22:00\"}] ";
        String str2 = "[{\"beginTime\":\"21:00\",\"endTime\":\"22:00\"}] ";
        Object obj = JSON.parse(str);
        Object obj2 = JSON.parse(str2);
        ArrayList<Para> paras = (ArrayList<Para>) JSON.parseArray(str, Para.class);
        ArrayList<Para> paras2 = (ArrayList<Para>) JSON.parseArray(str2, Para.class);
        System.out.println(obj.toString());
        System.out.println(obj2.toString());
    }

}
class Para{
    String beginTime;
    String endTime;

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}