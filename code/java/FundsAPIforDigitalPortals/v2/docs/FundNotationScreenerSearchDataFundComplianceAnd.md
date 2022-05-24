

# FundNotationScreenerSearchDataFundComplianceAnd


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **BigDecimal** | Identifier of a compliance property.  &amp;#8291;  Examples:  &amp;#8291;  &amp;#8291;1.  Only funds compliant to ALL of the following: (1), (2), and (3) are considered:  &#x60;\&quot;compliance\&quot;:{ \&quot;fund\&quot;: { \&quot;or\&quot;: [{ \&quot;and\&quot;: [{ \&quot;id\&quot;:1, \&quot;negate\&quot;:false }, {\&quot;id\&quot;:2, \&quot;negate\&quot;:false}, {\&quot;id\&quot;:3, \&quot;negate\&quot;:false}]}]}}&#x60;  &amp;#8291;  &amp;#8291;2. Only funds compliant to either (1) or to (2) are considered:  &#x60;\&quot;compliance\&quot;:{ \&quot;fund\&quot;: { \&quot;or\&quot;: [{ \&quot;and\&quot;: [{ \&quot;id\&quot;:1, \&quot;negate\&quot;:false  }]}, {\&quot;and\&quot;: [{ \&quot;id\&quot;:2, \&quot;negate\&quot;:false }]}]}}&#x60;  &amp;#8291;  &amp;#8291;3. Only funds compliant to (1) or to (2), but not compliant to (3) are considered:  &#x60;\&quot;compliance\&quot;:{ \&quot;fund\&quot;: { \&quot;or\&quot;: [{ \&quot;and\&quot;: [{ \&quot;id\&quot;:1, \&quot;negate\&quot;:false },{\&quot;id\&quot;:3, \&quot;negate\&quot;:true}]}, {\&quot;and\&quot;: [{ \&quot;id\&quot;:2, \&quot;negate\&quot;:false},{\&quot;id\&quot;:3, \&quot;negate\&quot;:true}]}]}}&#x60; |  [optional]
**negate** | **Boolean** | If &#x60;true&#x60;, the condition excludes funds compliant to the compliance property.  |  [optional]


## Implemented Interfaces

* Serializable


