# investmentresearch.PurchaseRequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentIds** | **[String]** | Requested document identifiers obtained from the &#x60;documentId&#x60; field of a &#x60;/search&#x60; response. Maximum 1000 IDs per request. | 
**fields** | **[String]** | Optional list of metadata fields to include in each returned document. When omitted, all fields are returned. At minimum, &#x60;documentId&#x60; and &#x60;purchaseLink&#x60; are always included regardless of this parameter. Valid values correspond to the property names of &#x60;PurchaseDocument&#x60;. | [optional] 



## Enum: [FieldsEnum]


* `headline` (value: `"headline"`)

* `source` (value: `"source"`)

* `primaryIds` (value: `"primaryIds"`)

* `allIds` (value: `"allIds"`)

* `categories` (value: `"categories"`)

* `storyDateTime` (value: `"storyDateTime"`)

* `contributorName` (value: `"contributorName"`)

* `contributorId` (value: `"contributorId"`)

* `analystName` (value: `"analystName"`)

* `analystId` (value: `"analystId"`)

* `pages` (value: `"pages"`)

* `documentId` (value: `"documentId"`)

* `reportFoci` (value: `"reportFoci"`)

* `assetClasses` (value: `"assetClasses"`)

* `assetTypes` (value: `"assetTypes"`)

* `coverageActions` (value: `"coverageActions"`)

* `compilationIndicators` (value: `"compilationIndicators"`)

* `disciplines` (value: `"disciplines"`)

* `issuerTypes` (value: `"issuerTypes"`)

* `periodicities` (value: `"periodicities"`)

* `purposes` (value: `"purposes"`)

* `ratingActions` (value: `"ratingActions"`)

* `researchApproaches` (value: `"researchApproaches"`)

* `securityTypes` (value: `"securityTypes"`)

* `targetActions` (value: `"targetActions"`)

* `weightingActions` (value: `"weightingActions"`)

* `purchaseLink` (value: `"purchaseLink"`)




