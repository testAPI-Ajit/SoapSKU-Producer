package in.kpmg.iocl.service;

import in.kpmg.iocl.model.SKUModel;
import in.kpmg.iocl.repository.SKURepository;
import in.kpmg.iocl.skuapi.SkuAltConversion;
import in.kpmg.iocl.skuapi.SkuAltConversionRequest;
import in.kpmg.iocl.skuapi.SkuAltConversionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

@Service
public class SKUService {

    @Autowired
    SKURepository skuRepository;

    public SkuAltConversionResponse getSkuresponse(@RequestBody SkuAltConversionRequest req) {

        String conversion_factor = req.getConversionFactor();
        String alt_from_uom = req.getAlternateFromUom();
        String alt_to_UOM = req.getAlternateToUom();
        String materialCode = req.getMaterialCode();

        SkuAltConversionResponse skuAltConversionResponse = new SkuAltConversionResponse();
        skuAltConversionResponse.setIsSuccess(false);

        List<SkuAltConversion> skuAltConversionDetails = new ArrayList<>();

        if(materialCode!=null && alt_from_uom !=null & alt_from_uom !=null && conversion_factor !=null)
        {
            try {
                List<SKUModel> skuDetails = skuRepository.getSKUData(conversion_factor,alt_from_uom,alt_to_UOM,materialCode);
                    for(SKUModel skuData:skuDetails)
                    {
                        SkuAltConversion sku_altConversion = new SkuAltConversion();
                        sku_altConversion.setConversionFactor(sku_altConversion.getConversionFactor());
                        sku_altConversion.setAlternateFromUOM(sku_altConversion.getAlternateFromUOM());
                        sku_altConversion.setAlternateToUOM(sku_altConversion.getAlternateToUOM());
                        sku_altConversion.setMaterialCode(sku_altConversion.getMaterialCode());
                    }

                    if (materialCode == null) {
                    skuAltConversionResponse.setIsSuccess(false);
                    skuAltConversionResponse.setMessage("Material Code is empty");
                    }

            }catch(Exception ex){
                System.out.println( "Error: "+ ex.getMessage());
            }
        }return skuAltConversionResponse;
    }
    {
        System.out.print("");
    }
}
