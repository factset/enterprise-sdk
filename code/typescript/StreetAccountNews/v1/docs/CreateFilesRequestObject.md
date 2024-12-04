# streetaccountnews.CreateFilesRequestObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateTimeRange** | [**DateTimeRangeObject**](DateTimeRangeObject.md) |  | 
**identifiers** | **[String]** | Returns files for specified CUSIP, SEDOL, ISIN, Entity Identifier, Ticker and Regional Ticker. If this parameter is not specified, it will return all the files that covered under specified category. | [optional] 
**category** | **[String]** | Each category corresponds to AT LEAST 1 output file. Depending on the date range provided, each category can produce any number of output files. If multiple files are created for one category, the files themselves have no specific order.   * companyNewsAll &#x3D; Company News - All Regions * companyNewsNA &#x3D; Company News - North America Region * companyNewsEU &#x3D; Company News -EU Region * companyNewsAPAC &#x3D; Company News - APAC Region * companyNewsESG &#x3D; Company News - ESG * macroTtnAll &#x3D; Macro and Today&#39;s Top News - All Regions * macroTtnNA &#x3D; Macro and Today&#39;s Top News - North America Region * macroTtnEU &#x3D; Macro and Today&#39;s Top News - EU Region * macroTtnAPAC &#x3D; Macro and Today&#39;s Top News - APAC  Region * macroTtnESG &#x3D; Macro and Today&#39;s Top News - ESG * all &#x3D; Content bundle includes \&quot;Company News - All Regions\&quot;, \&quot;Company News - ESG\&quot;, \&quot;Macro and Today&#39;s Top News - All Regions\&quot;, and \&quot;Macro and Today&#39;s Top News - ESG\&quot; * macroTtnBanking &#x3D; Macro and Today&#39;s Top News -Banking * macroTtnConsumer &#x3D; Macro and Today&#39;s Top News - Consumer * macroTtnEnergy &#x3D; Macro and Today&#39;s Top News - Energy * macroTtnHealthcare &#x3D; Macro and Today&#39;s Top News - Healthcare * macroTtnIndustrials &#x3D; Macro and Today&#39;s Top News - Industrials * macroTtnInsurance &#x3D; Macro and Today&#39;s Top News - Insurance * macroTtnMedia &#x3D;  Macro and Today&#39;s Top News - Media &amp; Telecom * macroTtnMetals &#x3D; Macro and Today&#39;s Top News - Metals &amp; Mining * macroTtnPower &#x3D; Macro and Today&#39;s Top News - Power &amp; Utilities * macroTtnRealEstate &#x3D; Macro and Today&#39;s Top News - Real Estate * macroTtnTech &#x3D; Macro and Today&#39;s Top News -Technology * macroTtnAllSectors &#x3D; Macro and Today&#39;s Top News - All Sectors | 



## Enum: [CategoryEnum]


* `companyNewsAll` (value: `"companyNewsAll"`)

* `companyNewsNA` (value: `"companyNewsNA"`)

* `companyNewsEU` (value: `"companyNewsEU"`)

* `companyNewsAPAC` (value: `"companyNewsAPAC"`)

* `companyNewsESG` (value: `"companyNewsESG"`)

* `macroTtnAll` (value: `"macroTtnAll"`)

* `macroTtnNA` (value: `"macroTtnNA"`)

* `macroTtnEU` (value: `"macroTtnEU"`)

* `macroTtnAPAC` (value: `"macroTtnAPAC"`)

* `macroTtnESG` (value: `"macroTtnESG"`)

* `all` (value: `"all"`)

* `macroTtnBanking` (value: `"macroTtnBanking"`)

* `macroTtnConsumer` (value: `"macroTtnConsumer"`)

* `macroTtnEnergy` (value: `"macroTtnEnergy"`)

* `macroTtnHealthcare` (value: `"macroTtnHealthcare"`)

* `macroTtnIndustrials` (value: `"macroTtnIndustrials"`)

* `macroTtnInsurance` (value: `"macroTtnInsurance"`)

* `macroTtnMedia` (value: `"macroTtnMedia"`)

* `macroTtnMetals` (value: `"macroTtnMetals"`)

* `macroTtnPower` (value: `"macroTtnPower"`)

* `macroTtnRealEstate` (value: `"macroTtnRealEstate"`)

* `macroTtnTech` (value: `"macroTtnTech"`)

* `macroTtnAllSectors` (value: `"macroTtnAllSectors"`)




