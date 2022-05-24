# stocksapifordigitalportals.StockNotationScreenerSearchDataComplianceFranceAnd

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | Identifier of a compliance property. The compliance properties with &#x60;id&#x3D;4&#x60; (SRD) and &#x60;id&#x3D;10&#x60; (SRD long only) are mutually exclusive.  &amp;#8291;  Examples:  &amp;#8291;  &amp;#8291;1. Retrieve only stocks which are compliant to all of the following: PEA, PEAPME, and SRD  &#x60;\&quot;compliance\&quot;:{ \&quot;france\&quot;: { \&quot;or\&quot;: [{ \&quot;and\&quot;: [{ \&quot;id\&quot;:2, \&quot;negate\&quot;:false }, {\&quot;id\&quot;:3, \&quot;negate\&quot;:false}, {\&quot;id\&quot;:4, \&quot;negate\&quot;:false}]}]}}&#x60;  &amp;#8291;  &amp;#8291;2. Retrieve only stocks which are compliant to PEA or to PEAPME  &#x60;\&quot;compliance\&quot;:{ \&quot;france\&quot;: { \&quot;or\&quot;: [{ \&quot;and\&quot;: [{ \&quot;id\&quot;:2, \&quot;negate\&quot;:false  }]}, {\&quot;and\&quot;: [{ \&quot;id\&quot;:3, \&quot;negate\&quot;:false }]}]}}&#x60;  &amp;#8291;  &amp;#8291;3. Retrieve only stocks which are compliant to PEA or to PEAPME, but are not compliant to SRD long only.  &#x60;\&quot;compliance\&quot;:{ \&quot;france\&quot;: { \&quot;or\&quot;: [{ \&quot;and\&quot;: [{ \&quot;id\&quot;:2, \&quot;negate\&quot;:false },{\&quot;id\&quot;:10, \&quot;negate\&quot;:true}]}, {\&quot;and\&quot;: [{ \&quot;id\&quot;:3, \&quot;negate\&quot;:false},{\&quot;id\&quot;:10, \&quot;negate\&quot;:true}]}]}}&#x60; | [optional] 
**negate** | **Boolean** | If &#x60;true&#x60;, the condition excludes stocks compliant to the compliance property.  | [optional] 


