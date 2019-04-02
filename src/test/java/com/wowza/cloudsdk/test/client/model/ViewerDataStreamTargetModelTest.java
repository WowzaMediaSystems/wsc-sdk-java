 /*
 * This code and all components © 2015 - 2019 Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the BSD 3-Clause License.
 * 
 * Wowza Streaming Cloud REST API Reference Documentation
 */
package com.wowza.cloudsdk.test.client.model;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;

import org.junit.Test;
import org.junit.Ignore;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.time.ZoneId;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

public class ViewerDataStreamTargetModelTest {
	ViewerDataStreamTarget modelObject = new ViewerDataStreamTarget();


     @Test
     public void ViewerDataStreamTargetModelTest_setCountries()
     {
         UsageViewerDataCountries usageViewerDataCountries = new UsageViewerDataCountries();
         CountryObject countryObject = new CountryObject();
         TheCountryCodeOfTheCountry countryCode = new TheCountryCodeOfTheCountry();
         countryCode.setName("FR");
         countryObject.setCountryCode(countryCode);
         usageViewerDataCountries.add(countryObject);
             modelObject.setCountries(usageViewerDataCountries);
             assertEquals(modelObject.getCountries().get(0).getCountryCode().getName(),"FR");
     }
     @Test
     public void ViewerDataStreamTargetModelTest_setCountryList()
     {
         List<String> countryList = new ArrayList<String>();
         countryList.add("DE");
             modelObject.setCountryList(countryList);
             assertEquals(modelObject.getCountryList().get(0),"DE");
     }
     @Test
     public void ViewerDataStreamTargetModelTest_setPercentageViewers()
     {
             modelObject.setPercentageViewers(12345);
             assertEquals(modelObject.getPercentageViewers().intValue(),12345);
     }
     @Test
     public void ViewerDataStreamTargetModelTest_setPercentageViewingTime()
     {
             modelObject.setPercentageViewingTime(12345);
             assertEquals(modelObject.getPercentageViewingTime().intValue(),12345);
     }
     @Test
     public void ViewerDataStreamTargetModelTest_setProtocols()
     {
         UsageViewerDataProtocols usageViewerDataProtocols = new UsageViewerDataProtocols();
         ProtocolObject protocolObject = new ProtocolObject();
         TheNameOfTheProtocol protocolName = new TheNameOfTheProtocol();
         protocolName.setName("rtmp");
         protocolObject.setProtocolName(protocolName);
         usageViewerDataProtocols.add(protocolObject);
             modelObject.setProtocols(usageViewerDataProtocols);
             assertEquals(modelObject.getProtocols().get(0).getProtocolName().getName(),"rtmp");
     }
     @Test
     public void ViewerDataStreamTargetModelTest_setRenditionList()
     {
         List<String> renditionList = new ArrayList<String>();
         renditionList.add("renditionOne");
             modelObject.setRenditionList(renditionList);
             assertEquals(modelObject.getRenditionList().get(0),"renditionOne");
     }
     @Test
     public void ViewerDataStreamTargetModelTest_setRenditions()
     {
         UsageViewerDataRenditions usageViewerDataRenditions = new UsageViewerDataRenditions();
         RenditionObject renditionObject = new RenditionObject();
         TheNameOfTheRendition renditionName = new TheNameOfTheRendition();
         renditionName.setName("renditionOne");
         renditionObject.setRenditionName(renditionName);
         usageViewerDataRenditions.add(renditionObject);
             modelObject.setRenditions(usageViewerDataRenditions);
             assertEquals(modelObject.getRenditions().get(0).getRenditionName().getName(),"renditionOne");
     }
     @Test
     public void ViewerDataStreamTargetModelTest_setSecondsAvgViewingTime()
     {
             modelObject.setSecondsAvgViewingTime(12345);
             assertEquals(modelObject.getSecondsAvgViewingTime().intValue(),12345);
     }
     @Test
     public void ViewerDataStreamTargetModelTest_setSecondsTotalViewingTime()
     {
             modelObject.setSecondsTotalViewingTime(12345);
             assertEquals(modelObject.getSecondsTotalViewingTime().intValue(),12345);
     }
     @Test
     public void ViewerDataStreamTargetModelTest_setTotalUniqueViewers()
     {
             modelObject.setTotalUniqueViewers(12345);
             assertEquals(modelObject.getTotalUniqueViewers().intValue(),12345);
     }
}

