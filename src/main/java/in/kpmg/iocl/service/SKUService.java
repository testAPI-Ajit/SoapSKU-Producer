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

        String materialCode = req.getMaterialCode();
        String alt_from_uom = req.getAlternateFromUom();
        String alt_to_UOM = req.getAlternateToUom();
        String denominator_conversion =req.getDenominatorConversion();
        String numerator_conversion = req.getNumeratorConversion();


        SkuAltConversionResponse skuAltConversionResponse = new SkuAltConversionResponse();
        skuAltConversionResponse.setIsSuccess(false);

        List<SkuAltConversion> skuAltConversionDetails = new ArrayList<>();

        if(materialCode!=null && alt_from_uom !=null & alt_from_uom !=null && denominator_conversion !=null && numerator_conversion !=null)
        {
            try {
                List<SKUModel> skuDetails = skuRepository.getSKUData(materialCode,alt_from_uom,alt_to_UOM,denominator_conversion,numerator_conversion);
                    for(SKUModel skuData:skuDetails) {
                        SkuAltConversion sku_altConversion = new SkuAltConversion();

                        sku_altConversion.setMaterialCode(sku_altConversion.getMaterialCode());
                        sku_altConversion.setAlternateFromUom(sku_altConversion.getAlternateFromUom());
                        sku_altConversion.setAlternateToUom(sku_altConversion.getAlternateToUom());
                        sku_altConversion.setDenominatorConversion(sku_altConversion.getDenominatorConversion());
                        sku_altConversion.setNumeratorConversion(sku_altConversion.getNumeratorConversion());


                    }
            }catch(Exception ex){
                System.out.println( "Error: "+ ex.getMessage());
            }
        }return skuAltConversionResponse;
    }
}
