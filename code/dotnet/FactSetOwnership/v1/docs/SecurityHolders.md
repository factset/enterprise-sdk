# FactSet.SDK.FactSetOwnership.Model.SecurityHolders
Security Holders response object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HolderId** | **string** | FactSet Ownership Holders ID that corresponds to the requested security holder. | [optional] 
**FsymId** | **string** | FactSet Security Identifier of security requested. This does not represent the FactSet permanent identifier for the holder, but rather the requested id. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. | [optional] 
**HolderEntityId** | **string** | FactSet Entity ID that corresponds to the specified holder ID. | [optional] 
**HolderName** | **string** | Name of the holder for the requested security identifier. | [optional] 
**Date** | **DateTime** | Date of the reported holding in YYYY-MM-DD format. For more details regarding date resolution, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262). | [optional] 
**Currency** | **string** | Currency code. The service will default to the local currency if the currency is not requested. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**InvestorType** | **string** | FactSet Ownership Institution, Mutual Fund, and Insider/Stakeholder investor types. To learn more about the different investor types, visit [Online Assistant Page #11656](https://my.apps.factset.com/oa/pages/11656). | [optional] 
**HolderType** | **string** | Holder Type name of the respective holder object. The name will align to the holderType requested.  | [optional] 
**AdjHolding** | **double** | Adjusted number of shares held. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet&#39;s Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262). | [optional] 
**AdjMarketValue** | **double** | Adjusted market values of shares held. Market Value. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet&#39;s Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262). | [optional] 
**WeightClose** | **double** | \&quot;Closing weight of the security for the holders of the requested security (percent). To learn more about how ownership weight is calculated please visit [Online Assistant Page #11247](https://my.apps.factset.com/oa/pages/11247).\&quot;  | [optional] 
**PercentOutstanding** | **double** | The percent of the outstanding common shares held by a particular filing institution. To learn more, visit [Online Assistant Page #11041](https://my.apps.factset.com/oa/pages/11041). | [optional] 
**Source** | **string** | Either the 13F Form or ND-30D report filed where the security holdings data was sourced from. To learn more about source, please visit https://my.apps.factset.com/oa/pages/11260 | [optional] 
**RequestId** | **string** | Security Identifier that was used in the request.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

