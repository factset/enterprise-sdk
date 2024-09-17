# FactSet.SDK.FactSetPeople.Model.CompanyStats
List of the statistics such as the average age, tenure, compensation of leadership, the number of executives, and the gender diversity of leadership for the requested identifier.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Identifier for the company. | [optional] 
**AverageMgmtCompensation** | **decimal?** | Average compensation for the executives | [optional] 
**AverageTenure** | **double?** | Avergae tenure of the people | [optional] 
**MedianTenure** | **double?** | Median tenure | [optional] 
**AverageAge** | **double?** | Average of the executives on the management and board | [optional] 
**MaxAge** | **decimal?** | Maximum age of the people on Management &amp; Board | [optional] 
**MinimumAge** | **decimal?** | Minimum age of the person on board | [optional] 
**MedianAge** | **decimal?** | Median age of the people on board | [optional] 
**BoardIndependentDirectors** | **decimal?** | Independent directors on the board | [optional] 
**FemaleBoardMembers** | **decimal?** | Number of female members on the board | [optional] 
**FemaleBoardMembersPercent** | **double?** | Percentage of female members on the board | [optional] 
**NumberOfMembers** | **decimal?** | Number of people on board. | [optional] 
**OnOtherBoardsAll** | **decimal?** | On Other Boards All | [optional] 
**OnOtherBoardsCorporate** | **decimal?** | On Other Boards Corporate | [optional] 
**MbType** | **string** | Management and Board type, where MB &#x3D; Management &amp; Board, MGMT &#x3D; Management, and BRD &#x3D; Board. This is a pass-through value from the input used in the &#x60;mbType&#x60; query parameter. | [optional] 
**RequestId** | **string** | Original identifier used for the request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

