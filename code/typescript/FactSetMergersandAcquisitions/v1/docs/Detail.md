# factsetmergersandacquisitions.Detail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dealId** | **String** | FactSet unique deal Identifier. | [optional] 
**target** | [**Target**](Target.md) |  | [optional] 
**buyers** | [**[Participant]**](Participant.md) | Array of participants in the deal who are buyers. | [optional] 
**sellers** | [**[Participant]**](Participant.md) | Array of participants in the deal who are sellers. | [optional] 
**status** | **String** | Status of the deal. | [optional] 
**rumorDate** | **Date** | For a transaction that initially start out as a rumor, the date on which talks of the transaction first appeared in a major financial or trade publication. For so long as the transaction remains a rumor, the Rumor Date and the Announcement Date will be the same. Once confirmed and the transaction is no longer a rumor, the Rumor Date will remain unchanged and the Announcement Date will be updated to reflect the date upon which one of the parties involved in the deal disclosed the formal offer or a definitive agreement. | [optional] 
**announceDate** | **Date** | Date the deal was announced. | [optional] 
**referenceDate** | **Date** | In a competing bid situation, the common date (earliest announcement date) used across all related transactions in order to determine the target&#39;s share prices, financials, premiums/multiples and all currency conversions (allowing for a common basis of comparison). For all other transactions, the Competing Bid Reference Date will be the same as the Announcement Date. For example, Peet&#39;s Coffee &amp; Tea, Inc. announced its intent to acquire Diedrich Coffee, Inc. on 2009-11-02. Green Mountain Coffee Roasters jumped this transaction, announcing its own competing bid on 2009-11-23. Green Mountain eventually won its bid, completing the acquisition on 2010-05-11. For both transactions, the Competing Bid Reference Date is 2009-11-02. | [optional] 
**expectedCloseDate** | **Date** | Expected close date of the deal. | [optional] 
**closeDate** | **Date** | Date the deal was closed. | [optional] 
**cancelDate** | **Date** | Date the deal was cancelled. | [optional] 
**dealType** | **String** | Type of deal. | [optional] 
**sourceFunds** | **[String]** | Method by which the acquirer was to finance the cash portion of the consideration offered in transaction (e.g., cash, bank debt, issuance of notes/bonds, etc.). For example, VF Corp financed its $2.2 bil all cash offer for The Timberland Company by issuing $900 mil in term notes and funding the balance through a combination of cash on hand and commercial paper. | [optional] 
**dealValue** | [**DealValue**](DealValue.md) |  | [optional] 
**purpose** | **String** | Transaction purpose code or description. | [optional] 
**evSales** | **Number** | Ratio: Enterprise value/sales. | [optional] 
**evEBIT** | **Number** | Ratio: Enterprise value/EBIT. | [optional] 
**evEBITDA** | **Number** | Ratio: Enterprise value/EBITDA. | [optional] 
**bepBV** | **Number** | Ratio: BEP/BV. | [optional] 
**sales** | **Number** | Sales at the time of the deal in USD. | [optional] 
**ebit** | **Number** | EBIT at the time of the deal in USD. | [optional] 
**ebitda** | **Number** | EBITDA at the time of the deal in USD. | [optional] 
**netIncome** | **Number** | Net income at the time of the deal in USD. | [optional] 
**cash** | **Number** | Cash at the time of the deal in USD. | [optional] 
**intBearingDebt** | **Number** | Interest bearing debt at the time of the deal in USD. | [optional] 
**prefStockValue** | **Number** | Preferred stock value at the time of the deal in USD. | [optional] 
**totalAssets** | **Number** | Total assets at the time of the deal in USD. | [optional] 
**sharesOutstanding** | **Number** | Shares outstanding at the time of the deal. | [optional] 
**eps** | **Number** | Earnings per share at the time of the deal in USD. | [optional] 
**bookValueShare** | **Number** | Book value per share at the time of the deal in USD. | [optional] 
**targetPostMergerOwn** | **Number** | Post Merger Ownership % - Target: The pro forma percentage of ownership to be held by target shareholders in the newly merged company. This data item is designed to reflect the expected ownership of the newly merged company at the time the transaction was announced. This data item will not be populated for Going Private transactions as they are not applicable since the acquirer in a going private transaction is not publicly traded. | [optional] 
**buyerPostMergerOwn** | **Number** | Post Merger Ownership % - Acquirer: The pro forma percentage of ownership to be held by acquirer shareholders in the newly merged company. This data item is designed to reflect the expected ownership of the newly merged company at the time the transaction was announced. This data item will not be populated for Going Private transactions as they are not applicable since the acquirer in a going private transaction is not publicly traded. | [optional] 
**attitude** | **String** | The way the target&#39;s board of directors viewed the acquirer&#39;s proposal to enter into the transaction - Friendly, Hostile, Neutral. | [optional] 
**dealSummary** | **String** | Summary of the deal. | [optional] 
**dealCharacteristics** | **[String]** | The secondary deal type(s). | [optional] 



## Enum: StatusEnum


* `Pending` (value: `"Pending"`)

* `Complete` (value: `"Complete"`)

* `Cancelled` (value: `"Cancelled"`)

* `Rumor` (value: `"Rumor"`)

* `Rumor Cancelled` (value: `"Rumor Cancelled"`)





## Enum: DealTypeEnum


* `Acquisition / Merger` (value: `"Acquisition / Merger"`)

* `Majority Stake` (value: `"Majority Stake"`)

* `Minority Stake` (value: `"Minority Stake"`)

* `Spinoff` (value: `"Spinoff"`)





## Enum: [SourceFundsEnum]


* `Bank Loan` (value: `"Bank Loan"`)

* `Bond/Note Issuance` (value: `"Bond/Note Issuance"`)

* `Internally Generated Funds` (value: `"Internally Generated Funds"`)

* `Mezzanine` (value: `"Mezzanine"`)

* `Private Company Debt` (value: `"Private Company Debt"`)

* `Private Equity/Venture Funding` (value: `"Private Equity/Venture Funding"`)

* `Private Warrant Option` (value: `"Private Warrant Option"`)

* `Source of Funding Not Disclosed` (value: `"Source of Funding Not Disclosed"`)

* `Stock Issuance: Pref &amp; Com (Public)` (value: `"Stock Issuance: Pref & Com (Public)"`)





## Enum: PurposeEnum


* `Financial` (value: `"Financial"`)

* `Strategic` (value: `"Strategic"`)





## Enum: AttitudeEnum


* `Friendly` (value: `"Friendly"`)

* `Hostile` (value: `"Hostile"`)

* `Neutral` (value: `"Neutral"`)





## Enum: [DealCharacteristicsEnum]


* `Divestment` (value: `"Divestment"`)

* `Employee Buy-Out` (value: `"Employee Buy-Out"`)

* `Exit` (value: `"Exit"`)

* `Investor Buy-In` (value: `"Investor Buy-In"`)

* `Investor Buy-Out` (value: `"Investor Buy-Out"`)

* `Insolvency` (value: `"Insolvency"`)

* `Management Buy-Out` (value: `"Management Buy-Out"`)

* `Reverse Takeover` (value: `"Reverse Takeover"`)

* `Secondary Buy-Out` (value: `"Secondary Buy-Out"`)

* `Leveraged Buy-Out` (value: `"Leveraged Buy-Out"`)

* `Going Private` (value: `"Going Private"`)

* `Exit (Partial)` (value: `"Exit (Partial)"`)

* `Control Premium Study` (value: `"Control Premium Study"`)

* `Private Equity Group` (value: `"Private Equity Group"`)

* `Asset Purchase` (value: `"Asset Purchase"`)

* `Related Party` (value: `"Related Party"`)

* `Tender Offer` (value: `"Tender Offer"`)

* `Unequal Voting` (value: `"Unequal Voting"`)

* `Target Controlling Shareholder` (value: `"Target Controlling Shareholder"`)

* `Auction` (value: `"Auction"`)

* `Club Deal - PE Group` (value: `"Club Deal - PE Group"`)

* `Club Deal - Corp/PE` (value: `"Club Deal - Corp/PE"`)

* `Venture Backed Acquirer` (value: `"Venture Backed Acquirer"`)

* `Unsolicited Bid` (value: `"Unsolicited Bid"`)

* `Rumor` (value: `"Rumor"`)

* `Scheme of Arrangement` (value: `"Scheme of Arrangement"`)

* `Golden Share` (value: `"Golden Share"`)

* `Merger of Equals` (value: `"Merger of Equals"`)

* `Privatization` (value: `"Privatization"`)

* `Indicative / Tentative Proposal` (value: `"Indicative / Tentative Proposal"`)

* `Club Deal - Corporate Group` (value: `"Club Deal - Corporate Group"`)

* `Multiple Target Deal` (value: `"Multiple Target Deal"`)

* `SPAC` (value: `"SPAC"`)

* `Squeeze Out` (value: `"Squeeze Out"`)

* `Special Committee` (value: `"Special Committee"`)

* `Collar` (value: `"Collar"`)

* `Forced Regulatory Divestiture` (value: `"Forced Regulatory Divestiture"`)

* `Venture-Backed Target` (value: `"Venture-Backed Target"`)

* `Bank Branch Purchase` (value: `"Bank Branch Purchase"`)

* `Bidder Special Committee` (value: `"Bidder Special Committee"`)

* `Target Special Committee` (value: `"Target Special Committee"`)

* `Bidder Controlling Shareholder` (value: `"Bidder Controlling Shareholder"`)

* `Property Transaction` (value: `"Property Transaction"`)

* `Power Plant Purchase` (value: `"Power Plant Purchase"`)




