# FactSet.SDK.FactSetGlobalPrices.Model.RightsIssue

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | FactSet Event Identifier. This is a unique identifier for each event. | [optional] 
**FsymId** | **string** | FactSet Permanent Identifier for the company/security associated with the event. | [optional] 
**RequestId** | **string** | The identifier for the company or security will only be returned when IDs are included in the request. Acceptable identifiers include Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent IDs. | [optional] 
**Identifier** | **string** | The ticker-region of the company or security. This field is returned regardless of any of the IDs provided. | [optional] 
**CompanyName** | **string** | Name of the company/security that declared the rights issue. | [optional] 
**ExchangeCode** | **string** | The exchange code where the event occurred. For a list of valid exchange codes, refer to the &#x60;/meta/exchanges&#x60; endpoint. | [optional] 
**ExchangeName** | **string** | Exchange where the security/company associated with the event is traded. | [optional] 
**Country** | **string** | The ISO Alpha-2 code of the country where the event occurred. | [optional] 
**EventType** | **string** | A brief description of the corporate action type. | [optional] 
**AnnouncementDate** | **DateTime?** | Date Event was announced in YYYY-MM-DD format. | [optional] 
**RecordDate** | **DateTime?** | Date of Record for distribution in YYYY-MM-DD format. | [optional] 
**PayDate** | **DateTime?** | Date of Payment for distribution in YYYY-MM-DD format. | [optional] 
**EffectiveDate** | **DateTime?** | Effective Date or Ex-Date of distribution in YYYY-MM-DD format. | [optional] 
**RightsIssuePrice** | **double?** | Price at which the rights are issued. | [optional] 
**RightsIssueCurrency** | **string** | Currency ISO code in which the rights are issued. | [optional] 
**PriceAdjFactor** | **double?** | The price adjustment factor associated with the rights issue. | [optional] 
**EventDescription** | **string** | Textual description identifying the event. | [optional] 
**DistIdentifier** | **string** | The identifier of the distributed company associated with the event. | [optional] 
**Error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

