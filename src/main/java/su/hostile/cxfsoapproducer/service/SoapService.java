package su.hostile.cxfsoapproducer.service;

import su.hostile.cxfsoapproducer.dto.ImportData;
import su.hostile.cxfsoapproducer.dto.ImportDataResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(
        name = "DataService",
        targetNamespace = "http://su.hostile.soap/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SoapService {

    @WebMethod(action = "ImportData")
    @WebResult(name = "ImportDataResponse", targetNamespace = "http://su.hostile.soap/")
    ImportDataResponse importData(
            @WebParam(name = "ImportData", targetNamespace = "http://su.hostile.soap/") ImportData request
    );

}
