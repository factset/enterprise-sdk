# FactSet.SDK.FactSetMergersandAcquisitions.Model.Detail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DealId** | **string** | FactSet unique deal Identifier. | [optional] 
**Target** | [**Target**](Target.md) |  | [optional] 
**Buyers** | [**List&lt;Participant&gt;**](Participant.md) | Array of participants in the deal who are buyers. | [optional] 
**Sellers** | [**List&lt;Participant&gt;**](Participant.md) | Array of participants in the deal who are sellers. | [optional] 
**AdvisorsInfo** | [**Advisors**](Advisors.md) |  | [optional] 
**Status** | **string** | Status of the deal. | [optional] 
**RumorDate** | **DateTime?** | For a transaction that initially start out as a rumor, the date on which talks of the transaction first appeared in a major financial or trade publication. For so long as the transaction remains a rumor, the Rumor Date and the Announcement Date will be the same. Once confirmed and the transaction is no longer a rumor, the Rumor Date will remain unchanged and the Announcement Date will be updated to reflect the date upon which one of the parties involved in the deal disclosed the formal offer or a definitive agreement. | [optional] 
**AnnounceDate** | **DateTime?** | Date the deal was announced. | [optional] 
**ReferenceDate** | **DateTime?** | In a competing bid situation, the common date (earliest announcement date) used across all related transactions in order to determine the target&#39;s share prices, financials, premiums/multiples and all currency conversions (allowing for a common basis of comparison). For all other transactions, the Competing Bid Reference Date will be the same as the Announcement Date. For example, Peet&#39;s Coffee &amp; Tea, Inc. announced its intent to acquire Diedrich Coffee, Inc. on 2009-11-02. Green Mountain Coffee Roasters jumped this transaction, announcing its own competing bid on 2009-11-23. Green Mountain eventually won its bid, completing the acquisition on 2010-05-11. For both transactions, the Competing Bid Reference Date is 2009-11-02. | [optional] 
**ExpectedCloseDate** | **DateTime?** | Expected close date of the deal. | [optional] 
**CloseDate** | **DateTime?** | Date the deal was closed. | [optional] 
**CancelDate** | **DateTime?** | Date the deal was cancelled. | [optional] 
**DealType** | **string** | Type of deal. | [optional] 
**SourceFunds** | **List&lt;string&gt;** | Method by which the acquirer was to finance the cash portion of the consideration offered in transaction (e.g., cash, bank debt, issuance of notes/bonds, etc.). For example, VF Corp financed its $2.2 bil all cash offer for The Timberland Company by issuing $900 mil in term notes and funding the balance through a combination of cash on hand and commercial paper. | [optional] 
**DealValue** | [**DealValue**](DealValue.md) |  | [optional] 
**Purpose** | **string** | Transaction purpose code or description. | [optional] 
**EvSales** | **decimal?** | Ratio: Enterprise value/sales. | [optional] 
**EvEBIT** | **decimal?** | Ratio: Enterprise value/EBIT. | [optional] 
**EvEBITDA** | **decimal?** | Ratio: Enterprise value/EBITDA. | [optional] 
**BepBV** | **decimal?** | Ratio: BEP/BV. | [optional] 
**Sales** | **decimal?** | Sales at the time of the deal in USD. | [optional] 
**Ebit** | **decimal?** | EBIT at the time of the deal in USD. | [optional] 
**Ebitda** | **decimal?** | EBITDA at the time of the deal in USD. | [optional] 
**NetIncome** | **decimal?** | Net income at the time of the deal in USD. | [optional] 
**Cash** | **decimal?** | Cash at the time of the deal in USD. | [optional] 
**IntBearingDebt** | **decimal?** | Interest bearing debt at the time of the deal in USD. | [optional] 
**PrefStockValue** | **decimal?** | Preferred stock value at the time of the deal in USD. | [optional] 
**TotalAssets** | **decimal?** | Total assets at the time of the deal in USD. | [optional] 
**SharesOutstanding** | **decimal?** | Shares outstanding at the time of the deal. | [optional] 
**Eps** | **decimal?** | Earnings per share at the time of the deal in USD. | [optional] 
**BookValueShare** | **decimal?** | Book value per share at the time of the deal in USD. | [optional] 
**TargetPostMergerOwn** | **decimal?** | Post Merger Ownership % - Target: The pro forma percentage of ownership to be held by target shareholders in the newly merged company. This data item is designed to reflect the expected ownership of the newly merged company at the time the transaction was announced. This data item will not be populated for Going Private transactions as they are not applicable since the acquirer in a going private transaction is not publicly traded. | [optional] 
**BuyerPostMergerOwn** | **decimal?** | Post Merger Ownership % - Acquirer: The pro forma percentage of ownership to be held by acquirer shareholders in the newly merged company. This data item is designed to reflect the expected ownership of the newly merged company at the time the transaction was announced. This data item will not be populated for Going Private transactions as they are not applicable since the acquirer in a going private transaction is not publicly traded. | [optional] 
**Attitude** | **string** | The way the target&#39;s board of directors viewed the acquirer&#39;s proposal to enter into the transaction - Friendly, Hostile, Neutral. | [optional] 
**DealSummary** | **string** | Summary of the deal. | [optional] 
**DealCharacteristics** | **List&lt;string&gt;** | The secondary deal type(s). Possible values include: - Divestment - Employee Buy-Out - Exit - Investor Buy-In - Investor Buy-Out - Insolvency - Management Buy-Out - Reverse Takeover - Secondary Buy-Out - Leveraged Buy-Out - Going Private - Exit (Partial) - Control Premium Study - Private Equity Group - Asset Purchase - Related Party - Tender Offer - Unequal Voting - Target Controlling Shareholder - Auction - Club Deal - PE Group - Club Deal - Corp/PE - Venture Backed Acquirer - Unsolicited Bid - Rumor - Scheme of Arrangement - Golden Share - Merger of Equals - Privatization - Indicative / Tentative Proposal - Club Deal - Corporate Group - Multiple Target Deal - SPAC - Squeeze Out - Special Committee - Collar - Forced Regulatory Divestiture - Venture-Backed Target - Bank Branch Purchase - Bidder Special Committee - Target Special Committee - Bidder Controlling Shareholder - Property Transaction - Power Plant Purchase - PE-Backed Target  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

