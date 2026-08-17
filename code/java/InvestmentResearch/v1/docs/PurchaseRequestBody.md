

# PurchaseRequestBody

Purchase request body elements

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentIds** | **java.util.List&lt;String&gt;** | Requested document identifiers obtained from the &#x60;documentId&#x60; field of a &#x60;/search&#x60; response. Maximum 1000 IDs per request. | 
**fields** | [**java.util.Set&lt;FieldsEnum&gt;**](#java.util.Set&lt;FieldsEnum&gt;) | Optional list of metadata fields to include in each returned document. When omitted, all fields are returned. At minimum, &#x60;documentId&#x60; and &#x60;purchaseLink&#x60; are always included regardless of this parameter. Valid values correspond to the property names of &#x60;PurchaseDocument&#x60;. |  [optional]



## Enum: java.util.Set&lt;FieldsEnum&gt;

Name | Value
---- | -----
HEADLINE | &quot;headline&quot;
SOURCE | &quot;source&quot;
PRIMARYIDS | &quot;primaryIds&quot;
ALLIDS | &quot;allIds&quot;
CATEGORIES | &quot;categories&quot;
STORYDATETIME | &quot;storyDateTime&quot;
CONTRIBUTORNAME | &quot;contributorName&quot;
CONTRIBUTORID | &quot;contributorId&quot;
ANALYSTNAME | &quot;analystName&quot;
ANALYSTID | &quot;analystId&quot;
PAGES | &quot;pages&quot;
DOCUMENTID | &quot;documentId&quot;
REPORTFOCI | &quot;reportFoci&quot;
ASSETCLASSES | &quot;assetClasses&quot;
ASSETTYPES | &quot;assetTypes&quot;
COVERAGEACTIONS | &quot;coverageActions&quot;
COMPILATIONINDICATORS | &quot;compilationIndicators&quot;
DISCIPLINES | &quot;disciplines&quot;
ISSUERTYPES | &quot;issuerTypes&quot;
PERIODICITIES | &quot;periodicities&quot;
PURPOSES | &quot;purposes&quot;
RATINGACTIONS | &quot;ratingActions&quot;
RESEARCHAPPROACHES | &quot;researchApproaches&quot;
SECURITYTYPES | &quot;securityTypes&quot;
TARGETACTIONS | &quot;targetActions&quot;
WEIGHTINGACTIONS | &quot;weightingActions&quot;
PURCHASELINK | &quot;purchaseLink&quot;


## Implemented Interfaces

* Serializable


