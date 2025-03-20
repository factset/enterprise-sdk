

# Detail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dealId** | **String** | FactSet unique deal Identifier. |  [optional]
**target** | [**Target**](Target.md) |  |  [optional]
**buyers** | [**java.util.List&lt;Participant&gt;**](Participant.md) | Array of participants in the deal who are buyers. |  [optional]
**sellers** | [**java.util.List&lt;Participant&gt;**](Participant.md) | Array of participants in the deal who are sellers. |  [optional]
**advisorsInfo** | [**Advisors**](Advisors.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the deal. |  [optional]
**rumorDate** | **LocalDate** | For a transaction that initially start out as a rumor, the date on which talks of the transaction first appeared in a major financial or trade publication. For so long as the transaction remains a rumor, the Rumor Date and the Announcement Date will be the same. Once confirmed and the transaction is no longer a rumor, the Rumor Date will remain unchanged and the Announcement Date will be updated to reflect the date upon which one of the parties involved in the deal disclosed the formal offer or a definitive agreement. |  [optional]
**announceDate** | **LocalDate** | Date the deal was announced. |  [optional]
**referenceDate** | **LocalDate** | In a competing bid situation, the common date (earliest announcement date) used across all related transactions in order to determine the target&#39;s share prices, financials, premiums/multiples and all currency conversions (allowing for a common basis of comparison). For all other transactions, the Competing Bid Reference Date will be the same as the Announcement Date. For example, Peet&#39;s Coffee &amp; Tea, Inc. announced its intent to acquire Diedrich Coffee, Inc. on 2009-11-02. Green Mountain Coffee Roasters jumped this transaction, announcing its own competing bid on 2009-11-23. Green Mountain eventually won its bid, completing the acquisition on 2010-05-11. For both transactions, the Competing Bid Reference Date is 2009-11-02. |  [optional]
**expectedCloseDate** | **LocalDate** | Expected close date of the deal. |  [optional]
**closeDate** | **LocalDate** | Date the deal was closed. |  [optional]
**cancelDate** | **LocalDate** | Date the deal was cancelled. |  [optional]
**dealType** | [**DealTypeEnum**](#DealTypeEnum) | Type of deal. |  [optional]
**sourceFunds** | [**java.util.List&lt;SourceFundsEnum&gt;**](#java.util.List&lt;SourceFundsEnum&gt;) | Method by which the acquirer was to finance the cash portion of the consideration offered in transaction (e.g., cash, bank debt, issuance of notes/bonds, etc.). For example, VF Corp financed its $2.2 bil all cash offer for The Timberland Company by issuing $900 mil in term notes and funding the balance through a combination of cash on hand and commercial paper. |  [optional]
**dealValue** | [**DealValue**](DealValue.md) |  |  [optional]
**purpose** | [**PurposeEnum**](#PurposeEnum) | Transaction purpose code or description. |  [optional]
**evSales** | **BigDecimal** | Ratio: Enterprise value/sales. |  [optional]
**evEBIT** | **BigDecimal** | Ratio: Enterprise value/EBIT. |  [optional]
**evEBITDA** | **BigDecimal** | Ratio: Enterprise value/EBITDA. |  [optional]
**bepBV** | **BigDecimal** | Ratio: BEP/BV. |  [optional]
**sales** | **BigDecimal** | Sales at the time of the deal in USD. |  [optional]
**ebit** | **BigDecimal** | EBIT at the time of the deal in USD. |  [optional]
**ebitda** | **BigDecimal** | EBITDA at the time of the deal in USD. |  [optional]
**netIncome** | **BigDecimal** | Net income at the time of the deal in USD. |  [optional]
**cash** | **BigDecimal** | Cash at the time of the deal in USD. |  [optional]
**intBearingDebt** | **BigDecimal** | Interest bearing debt at the time of the deal in USD. |  [optional]
**prefStockValue** | **BigDecimal** | Preferred stock value at the time of the deal in USD. |  [optional]
**totalAssets** | **BigDecimal** | Total assets at the time of the deal in USD. |  [optional]
**sharesOutstanding** | **BigDecimal** | Shares outstanding at the time of the deal. |  [optional]
**eps** | **BigDecimal** | Earnings per share at the time of the deal in USD. |  [optional]
**bookValueShare** | **BigDecimal** | Book value per share at the time of the deal in USD. |  [optional]
**targetPostMergerOwn** | **BigDecimal** | Post Merger Ownership % - Target: The pro forma percentage of ownership to be held by target shareholders in the newly merged company. This data item is designed to reflect the expected ownership of the newly merged company at the time the transaction was announced. This data item will not be populated for Going Private transactions as they are not applicable since the acquirer in a going private transaction is not publicly traded. |  [optional]
**buyerPostMergerOwn** | **BigDecimal** | Post Merger Ownership % - Acquirer: The pro forma percentage of ownership to be held by acquirer shareholders in the newly merged company. This data item is designed to reflect the expected ownership of the newly merged company at the time the transaction was announced. This data item will not be populated for Going Private transactions as they are not applicable since the acquirer in a going private transaction is not publicly traded. |  [optional]
**attitude** | [**AttitudeEnum**](#AttitudeEnum) | The way the target&#39;s board of directors viewed the acquirer&#39;s proposal to enter into the transaction - Friendly, Hostile, Neutral. |  [optional]
**dealSummary** | **String** | Summary of the deal. |  [optional]
**dealCharacteristics** | **java.util.List&lt;String&gt;** | The secondary deal type(s). Possible values include: - Divestment - Employee Buy-Out - Exit - Investor Buy-In - Investor Buy-Out - Insolvency - Management Buy-Out - Reverse Takeover - Secondary Buy-Out - Leveraged Buy-Out - Going Private - Exit (Partial) - Control Premium Study - Private Equity Group - Asset Purchase - Related Party - Tender Offer - Unequal Voting - Target Controlling Shareholder - Auction - Club Deal - PE Group - Club Deal - Corp/PE - Venture Backed Acquirer - Unsolicited Bid - Rumor - Scheme of Arrangement - Golden Share - Merger of Equals - Privatization - Indicative / Tentative Proposal - Club Deal - Corporate Group - Multiple Target Deal - SPAC - Squeeze Out - Special Committee - Collar - Forced Regulatory Divestiture - Venture-Backed Target - Bank Branch Purchase - Bidder Special Committee - Target Special Committee - Bidder Controlling Shareholder - Property Transaction - Power Plant Purchase - PE-Backed Target  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;Pending&quot;
COMPLETE | &quot;Complete&quot;
CANCELLED | &quot;Cancelled&quot;
RUMOR | &quot;Rumor&quot;
RUMOR_CANCELLED | &quot;Rumor Cancelled&quot;



## Enum: DealTypeEnum

Name | Value
---- | -----
ACQUISITION_MERGER | &quot;Acquisition / Merger&quot;
MAJORITY_STAKE | &quot;Majority Stake&quot;
MINORITY_STAKE | &quot;Minority Stake&quot;
SPINOFF | &quot;Spinoff&quot;



## Enum: java.util.List&lt;SourceFundsEnum&gt;

Name | Value
---- | -----
BANK_LOAN | &quot;Bank Loan&quot;
BOND_NOTE_ISSUANCE | &quot;Bond/Note Issuance&quot;
INTERNALLY_GENERATED_FUNDS | &quot;Internally Generated Funds&quot;
MEZZANINE | &quot;Mezzanine&quot;
PRIVATE_COMPANY_DEBT | &quot;Private Company Debt&quot;
PRIVATE_EQUITY_VENTURE_FUNDING | &quot;Private Equity/Venture Funding&quot;
PRIVATE_WARRANT_OPTION | &quot;Private Warrant Option&quot;
SOURCE_OF_FUNDING_NOT_DISCLOSED | &quot;Source of Funding Not Disclosed&quot;
STOCK_ISSUANCE_PREF_COM_PUBLIC_ | &quot;Stock Issuance: Pref &amp; Com (Public)&quot;



## Enum: PurposeEnum

Name | Value
---- | -----
FINANCIAL | &quot;Financial&quot;
STRATEGIC | &quot;Strategic&quot;



## Enum: AttitudeEnum

Name | Value
---- | -----
FRIENDLY | &quot;Friendly&quot;
HOSTILE | &quot;Hostile&quot;
NEUTRAL | &quot;Neutral&quot;


## Implemented Interfaces

* Serializable


