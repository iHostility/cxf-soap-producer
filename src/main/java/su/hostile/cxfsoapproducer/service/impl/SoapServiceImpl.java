package su.hostile.cxfsoapproducer.service.impl;

import org.springframework.stereotype.Service;
import su.hostile.cxfsoapproducer.dto.ImportData;
import su.hostile.cxfsoapproducer.dto.ImportDataResponse;
import su.hostile.cxfsoapproducer.service.SoapService;

import javax.jws.WebService;

@Service
@WebService(
        name = "ImportData",
        targetNamespace = "http://su.hostile.soap/",
        endpointInterface = "su.hostile.cxfsoapproducer.service.SoapService",
        portName = "ImportData",
        serviceName = "ImportData")
public class SoapServiceImpl implements SoapService {

    @Override
    public ImportDataResponse importData(ImportData request) {

        System.out.println(request.toString());

        ImportDataResponse response = new ImportDataResponse();
        response.setRetCode("0");
        response.setRetMsg("Success");

        return response;
    }
}
