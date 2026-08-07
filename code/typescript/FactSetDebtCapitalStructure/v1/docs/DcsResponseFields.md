# factsetdebtcapitalstructure.DcsResponseFields

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used for the request. | [optional] 
**fysmId** | **String** | Identifier that was used for the request. | [optional] 
**metric** | **String** | The requested &#x60;metric&#x60; input, representing the Liquidity data item. For a definition of the item please use the &#x60;/metrics&#x60; endpoint. | [optional] 
**fiscalYear** | **Number** | Fiscal year of the reported period in YYYY format. | [optional] 
**reportDate** | **Date** | Reporting date for the debt instrument. | [optional] 
**date** | **Date** | Date for the period requested expressed in YYYY-MM-DD format | [optional] 
**currency** | **String** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**value** | [**DCSValue**](DCSValue.md) |  | [optional] 


