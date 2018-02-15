package company.product.dpop.de_pop.notice.notice_activities;

/**
 * Created by gaurav on 15/2/18.
 */

public class NoticeDataModel {

    private String sectionName;
    private String noticeData;
    private String noticeSender;

    public NoticeDataModel(String sectionName, String noticeData, String noticeSender) {
        this.sectionName = sectionName;
        this.noticeData = noticeData;
        this.noticeSender = noticeSender;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getNoticeData() {
        return noticeData;
    }

    public void setNoticeData(String noticeData) {
        this.noticeData = noticeData;
    }


    public String getNoticeSender() {
        return noticeSender;
    }

    public void setNoticeSender(String noticeSender) {
        this.noticeSender = noticeSender;
    }
}
