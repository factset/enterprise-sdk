

# MaInvestment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**factsetPortCoEntityId** | **String** | Factset portfolio company entity identifier |  [optional]
**factsetInvestorEntityId** | **String** | Investor entity identifier |  [optional]
**entryDate** | **LocalDate** | Investment entry date |  [optional]
**exitDate** | **LocalDate** | Investment exit date |  [optional]
**entryType** | [**EntryTypeEnum**](#EntryTypeEnum) | Type of entry |  [optional]
**exitType** | [**ExitTypeEnum**](#ExitTypeEnum) | Type of exit |  [optional]
**dealId** | **Integer** | Unique FactSet-generated identifier assigned to a M&amp;A or VC deal |  [optional]
**ipoId** | **Integer** | IPO identifier associated with the pevc backed company |  [optional]
**retainingStake** | **Boolean** | Whether investor retains stake |  [optional]
**investmentCategory** | **Integer** | Categorizes the investment made. 1-Venture Capital, 0-Private Equity |  [optional]



## Enum: EntryTypeEnum

Name | Value
---- | -----
PRIVATE_PLACEMENT | &quot;Private Placement&quot;
CROWDFUNDING | &quot;Crowdfunding&quot;
ACCELERATOR_INCUBATOR | &quot;Accelerator/Incubator&quot;
M_A | &quot;M&amp;A&quot;
UNDISCLOSED_DATE | &quot;Undisclosed Date&quot;
FUND_MANAGEMENT_CHANGE | &quot;Fund Management change&quot;
PARTIAL_VC_EXIT | &quot;Partial VC Exit&quot;
AM_REORGANIZATION | &quot;AM Reorganization&quot;
CORPORATE | &quot;Corporate&quot;
CAPITALIZATION | &quot;Capitalization&quot;
ANGEL | &quot;Angel&quot;
SECONDARY | &quot;Secondary&quot;



## Enum: ExitTypeEnum

Name | Value
---- | -----
BANKRUPTCY | &quot;Bankruptcy&quot;
FUND_MANAGEMENT_CHANGE | &quot;Fund Management Change&quot;
IPO | &quot;IPO&quot;
M_A | &quot;M&amp;A&quot;
UNDISCLOSED_FULL_PORTFOLIO_EXIT_ | &quot;Undisclosed(Full Portfolio Exit)&quot;
PARTIAL_VC_EXIT | &quot;Partial VC Exit&quot;
GROWTH_SECONDARY_BUY_OUT | &quot;Growth Secondary Buy-Out&quot;
VC_RECAPITALIZATION | &quot;VC Recapitalization&quot;
UNDISCLOSED_SINGLE_INVESTOR_EXIT_ | &quot;Undisclosed(Single Investor Exit)&quot;
AM_REORGANIZATION | &quot;AM Reorganization&quot;
SECONDARY_BUYOUT | &quot;Secondary Buyout&quot;
REVERSE_TAKEOVER | &quot;Reverse Takeover&quot;
STRATEGIC_M_A | &quot;Strategic M&amp;A&quot;


## Implemented Interfaces

* Serializable


