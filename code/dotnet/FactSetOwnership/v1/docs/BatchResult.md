# FactSet.SDK.FactSetOwnership.Model.BatchResult
Batch Result Item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used in the request. | [optional] 
**FsymId** | **string** | FactSet Security Identifier of Fund. Identifies the security level id of the Fund requested (not-representing the underlying holding). Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. | [optional] 
**Date** | **DateTime?** | Date of the reported holding in YYYY-MM-DD format. For more details regarding date resolution, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262). | [optional] 
**Currency** | **string** | Currency code. The service will default to the funds local currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**AdjHolding** | **double?** | Adjusted number of shares held. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet&#39;s Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262). | [optional] 
**AdjMarketValue** | **double?** | Adjusted market values of shares held. Market Value. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet&#39;s Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262). | [optional] 
**WeightClose** | **double?** | \&quot;Closing weight of the security for the holders of the requested security (percent). To learn more about how ownership weight is calculated please visit [Online Assistant Page #11247](https://my.apps.factset.com/oa/pages/11247).\&quot;  | [optional] 
**IssueType** | **string** | Issue type of held security. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262). | [optional] 
**FsymSecurityId** | **string** | Represents the security id for the underlying holding, not the parent holding. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. | [optional] 
**FsymRegionalId** | **string** | FactSet Regional Security identifier of the security held in the fund. | [optional] 
**SecurityName** | **string** | Name of held security. | [optional] 
**SecurityTicker** | **string** | Ticker of held security. | [optional] 
**HolderId** | **string** | Returns the holder IDs for the insiders involved in the transactions that occurred between the specified start and end dates. | [optional] 
**HolderEntityId** | **string** | FactSet Entity ID that corresponds to the specified holder ID. | [optional] 
**HolderName** | **string** | Returns the names of the institutions involved in the transactions that occurred between the specified start and end dates. | [optional] 
**InvestorType** | **string** | FactSet Ownership Institution, Mutual Fund, and Insider/Stakeholder investor types. To learn more about the different investor types, visit [Online Assistant Page #11656](https://my.apps.factset.com/oa/pages/11656). | [optional] 
**HolderType** | **string** | Holder Type name of the respective holder object. The name will align to the holderType requested.  | [optional] 
**PercentOutstanding** | **double?** | The percent of the outstanding common shares held by a particular filing institution. To learn more, visit [Online Assistant Page #11041](https://my.apps.factset.com/oa/pages/11041). | [optional] 
**Source** | **string** | Either the 13F Form or ND-30D report filed where the security holdings data was sourced from. To learn more about source, please visit https://my.apps.factset.com/oa/pages/11260 | [optional] 
**HolderTitle** | **string** | Returns the titles of the insiders involved in the transactions that occurred between the specified start and end dates. | [optional] 
**Shares** | **decimal?** | Returns the transaction shares for the transactions that occurred between the specified start and end dates. | [optional] 
**Price** | **double?** | Returns the transaction prices for the transactions that occurred between the specified start and end dates. | [optional] 
**NetValueChange** | **double?** | Returns the transaction values for the transactions that occurred between the specified start and end dates. | [optional] 
**FilingDate** | **string** | Returns the dates on which the transactions that occurred between the specified start and end dates were processed. | [optional] 
**IsDerivative** | **bool?** | Returns a Derivative/Non-Derivative flag for the transactions that occurred between the specified start and end dates. Returns true for Derivative and false for Non-Derivative. | [optional] 
**IsDirect** | **bool?** | Returns a direct/indirect flag for the transactions that occurred between the specified start and end dates. | [optional] 
**TradeType** | **string** | Returns an acquisition/disposition flag for the transactions that occurred between the specified start and end dates. | [optional] 
**FormType** | **string** | Returns the form types for the transactions that occurred between the specified start and end dates. | [optional] 
**TransactionDate** | **string** | Returns the transaction dates for the transactions that occurred between the specified start and end dates. | [optional] 
**SharesOwned** | **decimal?** | Returns the shares owned data for the transactions that occurred between the specified start and end dates. | [optional] 
**SecRule10b51** | **bool?** | Returns rule 10b5-1 flags for the insiders involved in the transactions that occurred between the specified start and end dates. | [optional] 
**PctOS** | **double?** | Returns position held as a percentage of total outstanding data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**PctChange** | **double?** | Returns change in position held as a percentage of total outstanding data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**PosChange** | **double?** | Returns position change data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**MarketVal** | **double?** | Returns market value data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**PeriodOfMeasure** | **string** | Returns the range over which the code calculates change for Percent Ownership and Position Change. | [optional] 
**ReportDate** | **DateTime?** | Returns the report date for the transactions that occurred between the specified start and end dates. | [optional] 
**AsOfDate** | **DateTime?** | Date on which the specified data or information is accurate or relevant. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

