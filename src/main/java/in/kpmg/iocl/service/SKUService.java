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

        String materialNo = req.getMaterialNo();
        String baseUnitOfMeasure = req.getBaseUnitOfMeasure();
        String unitOfMeasureDisplay = req.getUnitOfMeasureDisplay();
        String numeratorConversion =req.getNumeratorConversion();
        String denominatorConversion = req.getDenominatorConversion();


        SkuAltConversionResponse skuAltConversionResponse = new SkuAltConversionResponse();
        skuAltConversionResponse.setIsSuccess(false);

        if(materialNo!=null && baseUnitOfMeasure !=null & unitOfMeasureDisplay !=null && numeratorConversion !=null && denominatorConversion !=null)
        {
            try {
                List<SKUModel> skuDetails = skuRepository.getSKUData(materialNo,baseUnitOfMeasure,unitOfMeasureDisplay,numeratorConversion,denominatorConversion);
                    for(SKUModel skuData:skuDetails) {
                        SkuAltConversion sku_altConversion = new SkuAltConversion();

                        sku_altConversion.setMaterialNo(sku_altConversion.getMaterialNo());
                        sku_altConversion.setBaseUnitOfMeasure(sku_altConversion.getBaseUnitOfMeasure());
                        sku_altConversion.setUnitOfMeasureDisplay(sku_altConversion.getUnitOfMeasureDisplay());
                        sku_altConversion.setNumeratorConversion(sku_altConversion.getNumeratorConversion());
                        sku_altConversion.setDenominatorConversion(sku_altConversion.getDenominatorConversion());


                    }
            }catch(Exception ex){
                System.out.println( "Error: "+ ex.getMessage());
            }
        }return skuAltConversionResponse;
    }
}
