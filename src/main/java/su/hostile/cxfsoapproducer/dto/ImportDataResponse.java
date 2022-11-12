package su.hostile.cxfsoapproducer.dto;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ImportDataResponse", namespace = "")
@XmlType(name = "ImportDataResponse", namespace = "http://su.hostile.soap/")
@XmlAccessorType(XmlAccessType.FIELD)
public class ImportDataResponse {

    public ImportDataResponse() {
    }

    @XmlElement(name = "retCode", namespace = "http://su.hostile.soap/")
    private String retCode;
    @XmlElement(name = "retMsg", namespace = "http://su.hostile.soap/")
    private String retMsg;

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }
}
