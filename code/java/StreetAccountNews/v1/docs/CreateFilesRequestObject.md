

# CreateFilesRequestObject

create-files request body elements

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateTimeRange** | [**DateTimeRangeObject**](DateTimeRangeObject.md) |  | 
**identifiers** | **java.util.List&lt;String&gt;** | Returns files for specified CUSIP, SEDOL, ISIN, Entity Identifier, Ticker and Regional Ticker. If this parameter is not specified, it will return all the files that covered under specified category. |  [optional]
**category** | [**java.util.List&lt;CategoryEnum&gt;**](#java.util.List&lt;CategoryEnum&gt;) | Each category corresponds to AT LEAST 1 output file. Depending on the date range provided, each category can produce any number of output files. If multiple files are created for one category, the files themselves have no specific order.   * companyNewsAll &#x3D; Company News - All Regions * companyNewsNA &#x3D; Company News - North America Region * companyNewsEU &#x3D; Company News -EU Region * companyNewsAPAC &#x3D; Company News - APAC Region * companyNewsESG &#x3D; Company News - ESG * macroTtnAll &#x3D; Macro and Today&#39;s Top News - All Regions * macroTtnNA &#x3D; Macro and Today&#39;s Top News - North America Region * macroTtnEU &#x3D; Macro and Today&#39;s Top News - EU Region * macroTtnAPAC &#x3D; Macro and Today&#39;s Top News - APAC  Region * macroTtnESG &#x3D; Macro and Today&#39;s Top News - ESG * all &#x3D; Content bundle includes \&quot;Company News - All Regions\&quot;, \&quot;Company News - ESG\&quot;, \&quot;Macro and Today&#39;s Top News - All Regions\&quot;, and \&quot;Macro and Today&#39;s Top News - ESG\&quot; * macroTtnBanking &#x3D; Macro and Today&#39;s Top News -Banking * macroTtnConsumer &#x3D; Macro and Today&#39;s Top News - Consumer * macroTtnEnergy &#x3D; Macro and Today&#39;s Top News - Energy * macroTtnHealthcare &#x3D; Macro and Today&#39;s Top News - Healthcare * macroTtnIndustrials &#x3D; Macro and Today&#39;s Top News - Industrials * macroTtnInsurance &#x3D; Macro and Today&#39;s Top News - Insurance * macroTtnMedia &#x3D;  Macro and Today&#39;s Top News - Media &amp; Telecom * macroTtnMetals &#x3D; Macro and Today&#39;s Top News - Metals &amp; Mining * macroTtnPower &#x3D; Macro and Today&#39;s Top News - Power &amp; Utilities * macroTtnRealEstate &#x3D; Macro and Today&#39;s Top News - Real Estate * macroTtnTech &#x3D; Macro and Today&#39;s Top News -Technology * macroTtnAllSectors &#x3D; Macro and Today&#39;s Top News - All Sectors | 



## Enum: java.util.List&lt;CategoryEnum&gt;

Name | Value
---- | -----
COMPANYNEWSALL | &quot;companyNewsAll&quot;
COMPANYNEWSNA | &quot;companyNewsNA&quot;
COMPANYNEWSEU | &quot;companyNewsEU&quot;
COMPANYNEWSAPAC | &quot;companyNewsAPAC&quot;
COMPANYNEWSESG | &quot;companyNewsESG&quot;
MACROTTNALL | &quot;macroTtnAll&quot;
MACROTTNNA | &quot;macroTtnNA&quot;
MACROTTNEU | &quot;macroTtnEU&quot;
MACROTTNAPAC | &quot;macroTtnAPAC&quot;
MACROTTNESG | &quot;macroTtnESG&quot;
ALL | &quot;all&quot;
MACROTTNBANKING | &quot;macroTtnBanking&quot;
MACROTTNCONSUMER | &quot;macroTtnConsumer&quot;
MACROTTNENERGY | &quot;macroTtnEnergy&quot;
MACROTTNHEALTHCARE | &quot;macroTtnHealthcare&quot;
MACROTTNINDUSTRIALS | &quot;macroTtnIndustrials&quot;
MACROTTNINSURANCE | &quot;macroTtnInsurance&quot;
MACROTTNMEDIA | &quot;macroTtnMedia&quot;
MACROTTNMETALS | &quot;macroTtnMetals&quot;
MACROTTNPOWER | &quot;macroTtnPower&quot;
MACROTTNREALESTATE | &quot;macroTtnRealEstate&quot;
MACROTTNTECH | &quot;macroTtnTech&quot;
MACROTTNALLSECTORS | &quot;macroTtnAllSectors&quot;


## Implemented Interfaces

* Serializable


