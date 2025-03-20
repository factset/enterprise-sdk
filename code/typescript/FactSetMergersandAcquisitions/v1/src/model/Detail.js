/**
 * FactSet Mergers and Acquisitions API
 * The FactSet Mergers and Acquisitions API provides access to key transactions and pricing metrics on over 60,000 globally traded deals. Reference a Global Universe of Mergers and Acquisitions (M&A) transactions where the target of the deal is a Publicly traded Company. Review premiums, multiples and fundamental data to gather insights on deals and create predictive models based on different deal characteristics.    Monetary values returned by this API are converted and represented in USD.    This API is allows a limit of 10 requests per second and a maximum of 10 concurrent requests. 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Advisors from './Advisors';
import DealValue from './DealValue';
import Participant from './Participant';
import Target from './Target';

/**
 * The Detail model module.
 * @module model/Detail
 */
class Detail {
    /**
     * Constructs a new <code>Detail</code>.
     * @alias module:model/Detail
     */
    constructor() { 
        
        Detail.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Detail</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Detail} obj Optional instance to populate.
     * @return {module:model/Detail} The populated <code>Detail</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Detail();

            if (data.hasOwnProperty('dealId')) {
                obj['dealId'] = ApiClient.convertToType(data['dealId'], 'String');
            }
            if (data.hasOwnProperty('target')) {
                obj['target'] = Target.constructFromObject(data['target']);
            }
            if (data.hasOwnProperty('buyers')) {
                obj['buyers'] = ApiClient.convertToType(data['buyers'], [Participant]);
            }
            if (data.hasOwnProperty('sellers')) {
                obj['sellers'] = ApiClient.convertToType(data['sellers'], [Participant]);
            }
            if (data.hasOwnProperty('advisorsInfo')) {
                obj['advisorsInfo'] = Advisors.constructFromObject(data['advisorsInfo']);
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
            if (data.hasOwnProperty('rumorDate')) {
                obj['rumorDate'] = ApiClient.convertToType(data['rumorDate'], 'Date');
            }
            if (data.hasOwnProperty('announceDate')) {
                obj['announceDate'] = ApiClient.convertToType(data['announceDate'], 'Date');
            }
            if (data.hasOwnProperty('referenceDate')) {
                obj['referenceDate'] = ApiClient.convertToType(data['referenceDate'], 'Date');
            }
            if (data.hasOwnProperty('expectedCloseDate')) {
                obj['expectedCloseDate'] = ApiClient.convertToType(data['expectedCloseDate'], 'Date');
            }
            if (data.hasOwnProperty('closeDate')) {
                obj['closeDate'] = ApiClient.convertToType(data['closeDate'], 'Date');
            }
            if (data.hasOwnProperty('cancelDate')) {
                obj['cancelDate'] = ApiClient.convertToType(data['cancelDate'], 'Date');
            }
            if (data.hasOwnProperty('dealType')) {
                obj['dealType'] = ApiClient.convertToType(data['dealType'], 'String');
            }
            if (data.hasOwnProperty('sourceFunds')) {
                obj['sourceFunds'] = ApiClient.convertToType(data['sourceFunds'], ['String']);
            }
            if (data.hasOwnProperty('dealValue')) {
                obj['dealValue'] = DealValue.constructFromObject(data['dealValue']);
            }
            if (data.hasOwnProperty('purpose')) {
                obj['purpose'] = ApiClient.convertToType(data['purpose'], 'String');
            }
            if (data.hasOwnProperty('evSales')) {
                obj['evSales'] = ApiClient.convertToType(data['evSales'], 'Number');
            }
            if (data.hasOwnProperty('evEBIT')) {
                obj['evEBIT'] = ApiClient.convertToType(data['evEBIT'], 'Number');
            }
            if (data.hasOwnProperty('evEBITDA')) {
                obj['evEBITDA'] = ApiClient.convertToType(data['evEBITDA'], 'Number');
            }
            if (data.hasOwnProperty('bepBV')) {
                obj['bepBV'] = ApiClient.convertToType(data['bepBV'], 'Number');
            }
            if (data.hasOwnProperty('sales')) {
                obj['sales'] = ApiClient.convertToType(data['sales'], 'Number');
            }
            if (data.hasOwnProperty('ebit')) {
                obj['ebit'] = ApiClient.convertToType(data['ebit'], 'Number');
            }
            if (data.hasOwnProperty('ebitda')) {
                obj['ebitda'] = ApiClient.convertToType(data['ebitda'], 'Number');
            }
            if (data.hasOwnProperty('netIncome')) {
                obj['netIncome'] = ApiClient.convertToType(data['netIncome'], 'Number');
            }
            if (data.hasOwnProperty('cash')) {
                obj['cash'] = ApiClient.convertToType(data['cash'], 'Number');
            }
            if (data.hasOwnProperty('intBearingDebt')) {
                obj['intBearingDebt'] = ApiClient.convertToType(data['intBearingDebt'], 'Number');
            }
            if (data.hasOwnProperty('prefStockValue')) {
                obj['prefStockValue'] = ApiClient.convertToType(data['prefStockValue'], 'Number');
            }
            if (data.hasOwnProperty('totalAssets')) {
                obj['totalAssets'] = ApiClient.convertToType(data['totalAssets'], 'Number');
            }
            if (data.hasOwnProperty('sharesOutstanding')) {
                obj['sharesOutstanding'] = ApiClient.convertToType(data['sharesOutstanding'], 'Number');
            }
            if (data.hasOwnProperty('eps')) {
                obj['eps'] = ApiClient.convertToType(data['eps'], 'Number');
            }
            if (data.hasOwnProperty('bookValueShare')) {
                obj['bookValueShare'] = ApiClient.convertToType(data['bookValueShare'], 'Number');
            }
            if (data.hasOwnProperty('targetPostMergerOwn')) {
                obj['targetPostMergerOwn'] = ApiClient.convertToType(data['targetPostMergerOwn'], 'Number');
            }
            if (data.hasOwnProperty('buyerPostMergerOwn')) {
                obj['buyerPostMergerOwn'] = ApiClient.convertToType(data['buyerPostMergerOwn'], 'Number');
            }
            if (data.hasOwnProperty('attitude')) {
                obj['attitude'] = ApiClient.convertToType(data['attitude'], 'String');
            }
            if (data.hasOwnProperty('dealSummary')) {
                obj['dealSummary'] = ApiClient.convertToType(data['dealSummary'], 'String');
            }
            if (data.hasOwnProperty('dealCharacteristics')) {
                obj['dealCharacteristics'] = ApiClient.convertToType(data['dealCharacteristics'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * FactSet unique deal Identifier.
 * @member {String} dealId
 */
Detail.prototype['dealId'] = undefined;

/**
 * @member {module:model/Target} target
 */
Detail.prototype['target'] = undefined;

/**
 * Array of participants in the deal who are buyers.
 * @member {Array.<module:model/Participant>} buyers
 */
Detail.prototype['buyers'] = undefined;

/**
 * Array of participants in the deal who are sellers.
 * @member {Array.<module:model/Participant>} sellers
 */
Detail.prototype['sellers'] = undefined;

/**
 * @member {module:model/Advisors} advisorsInfo
 */
Detail.prototype['advisorsInfo'] = undefined;

/**
 * Status of the deal.
 * @member {module:model/Detail.StatusEnum} status
 */
Detail.prototype['status'] = undefined;

/**
 * For a transaction that initially start out as a rumor, the date on which talks of the transaction first appeared in a major financial or trade publication. For so long as the transaction remains a rumor, the Rumor Date and the Announcement Date will be the same. Once confirmed and the transaction is no longer a rumor, the Rumor Date will remain unchanged and the Announcement Date will be updated to reflect the date upon which one of the parties involved in the deal disclosed the formal offer or a definitive agreement.
 * @member {Date} rumorDate
 */
Detail.prototype['rumorDate'] = undefined;

/**
 * Date the deal was announced.
 * @member {Date} announceDate
 */
Detail.prototype['announceDate'] = undefined;

/**
 * In a competing bid situation, the common date (earliest announcement date) used across all related transactions in order to determine the target's share prices, financials, premiums/multiples and all currency conversions (allowing for a common basis of comparison). For all other transactions, the Competing Bid Reference Date will be the same as the Announcement Date. For example, Peet's Coffee & Tea, Inc. announced its intent to acquire Diedrich Coffee, Inc. on 2009-11-02. Green Mountain Coffee Roasters jumped this transaction, announcing its own competing bid on 2009-11-23. Green Mountain eventually won its bid, completing the acquisition on 2010-05-11. For both transactions, the Competing Bid Reference Date is 2009-11-02.
 * @member {Date} referenceDate
 */
Detail.prototype['referenceDate'] = undefined;

/**
 * Expected close date of the deal.
 * @member {Date} expectedCloseDate
 */
Detail.prototype['expectedCloseDate'] = undefined;

/**
 * Date the deal was closed.
 * @member {Date} closeDate
 */
Detail.prototype['closeDate'] = undefined;

/**
 * Date the deal was cancelled.
 * @member {Date} cancelDate
 */
Detail.prototype['cancelDate'] = undefined;

/**
 * Type of deal.
 * @member {module:model/Detail.DealTypeEnum} dealType
 */
Detail.prototype['dealType'] = undefined;

/**
 * Method by which the acquirer was to finance the cash portion of the consideration offered in transaction (e.g., cash, bank debt, issuance of notes/bonds, etc.). For example, VF Corp financed its $2.2 bil all cash offer for The Timberland Company by issuing $900 mil in term notes and funding the balance through a combination of cash on hand and commercial paper.
 * @member {Array.<module:model/Detail.SourceFundsEnum>} sourceFunds
 */
Detail.prototype['sourceFunds'] = undefined;

/**
 * @member {module:model/DealValue} dealValue
 */
Detail.prototype['dealValue'] = undefined;

/**
 * Transaction purpose code or description.
 * @member {module:model/Detail.PurposeEnum} purpose
 */
Detail.prototype['purpose'] = undefined;

/**
 * Ratio: Enterprise value/sales.
 * @member {Number} evSales
 */
Detail.prototype['evSales'] = undefined;

/**
 * Ratio: Enterprise value/EBIT.
 * @member {Number} evEBIT
 */
Detail.prototype['evEBIT'] = undefined;

/**
 * Ratio: Enterprise value/EBITDA.
 * @member {Number} evEBITDA
 */
Detail.prototype['evEBITDA'] = undefined;

/**
 * Ratio: BEP/BV.
 * @member {Number} bepBV
 */
Detail.prototype['bepBV'] = undefined;

/**
 * Sales at the time of the deal in USD.
 * @member {Number} sales
 */
Detail.prototype['sales'] = undefined;

/**
 * EBIT at the time of the deal in USD.
 * @member {Number} ebit
 */
Detail.prototype['ebit'] = undefined;

/**
 * EBITDA at the time of the deal in USD.
 * @member {Number} ebitda
 */
Detail.prototype['ebitda'] = undefined;

/**
 * Net income at the time of the deal in USD.
 * @member {Number} netIncome
 */
Detail.prototype['netIncome'] = undefined;

/**
 * Cash at the time of the deal in USD.
 * @member {Number} cash
 */
Detail.prototype['cash'] = undefined;

/**
 * Interest bearing debt at the time of the deal in USD.
 * @member {Number} intBearingDebt
 */
Detail.prototype['intBearingDebt'] = undefined;

/**
 * Preferred stock value at the time of the deal in USD.
 * @member {Number} prefStockValue
 */
Detail.prototype['prefStockValue'] = undefined;

/**
 * Total assets at the time of the deal in USD.
 * @member {Number} totalAssets
 */
Detail.prototype['totalAssets'] = undefined;

/**
 * Shares outstanding at the time of the deal.
 * @member {Number} sharesOutstanding
 */
Detail.prototype['sharesOutstanding'] = undefined;

/**
 * Earnings per share at the time of the deal in USD.
 * @member {Number} eps
 */
Detail.prototype['eps'] = undefined;

/**
 * Book value per share at the time of the deal in USD.
 * @member {Number} bookValueShare
 */
Detail.prototype['bookValueShare'] = undefined;

/**
 * Post Merger Ownership % - Target: The pro forma percentage of ownership to be held by target shareholders in the newly merged company. This data item is designed to reflect the expected ownership of the newly merged company at the time the transaction was announced. This data item will not be populated for Going Private transactions as they are not applicable since the acquirer in a going private transaction is not publicly traded.
 * @member {Number} targetPostMergerOwn
 */
Detail.prototype['targetPostMergerOwn'] = undefined;

/**
 * Post Merger Ownership % - Acquirer: The pro forma percentage of ownership to be held by acquirer shareholders in the newly merged company. This data item is designed to reflect the expected ownership of the newly merged company at the time the transaction was announced. This data item will not be populated for Going Private transactions as they are not applicable since the acquirer in a going private transaction is not publicly traded.
 * @member {Number} buyerPostMergerOwn
 */
Detail.prototype['buyerPostMergerOwn'] = undefined;

/**
 * The way the target's board of directors viewed the acquirer's proposal to enter into the transaction - Friendly, Hostile, Neutral.
 * @member {module:model/Detail.AttitudeEnum} attitude
 */
Detail.prototype['attitude'] = undefined;

/**
 * Summary of the deal.
 * @member {String} dealSummary
 */
Detail.prototype['dealSummary'] = undefined;

/**
 * The secondary deal type(s). Possible values include: - Divestment - Employee Buy-Out - Exit - Investor Buy-In - Investor Buy-Out - Insolvency - Management Buy-Out - Reverse Takeover - Secondary Buy-Out - Leveraged Buy-Out - Going Private - Exit (Partial) - Control Premium Study - Private Equity Group - Asset Purchase - Related Party - Tender Offer - Unequal Voting - Target Controlling Shareholder - Auction - Club Deal - PE Group - Club Deal - Corp/PE - Venture Backed Acquirer - Unsolicited Bid - Rumor - Scheme of Arrangement - Golden Share - Merger of Equals - Privatization - Indicative / Tentative Proposal - Club Deal - Corporate Group - Multiple Target Deal - SPAC - Squeeze Out - Special Committee - Collar - Forced Regulatory Divestiture - Venture-Backed Target - Bank Branch Purchase - Bidder Special Committee - Target Special Committee - Bidder Controlling Shareholder - Property Transaction - Power Plant Purchase - PE-Backed Target 
 * @member {Array.<String>} dealCharacteristics
 */
Detail.prototype['dealCharacteristics'] = undefined;





/**
 * Allowed values for the <code>status</code> property.
 * @enum {String}
 * @readonly
 */
Detail['StatusEnum'] = {

    /**
     * value: "Pending"
     * @const
     */
    "Pending": "Pending",

    /**
     * value: "Complete"
     * @const
     */
    "Complete": "Complete",

    /**
     * value: "Cancelled"
     * @const
     */
    "Cancelled": "Cancelled",

    /**
     * value: "Rumor"
     * @const
     */
    "Rumor": "Rumor",

    /**
     * value: "Rumor Cancelled"
     * @const
     */
    "Rumor Cancelled": "Rumor Cancelled"
};


/**
 * Allowed values for the <code>dealType</code> property.
 * @enum {String}
 * @readonly
 */
Detail['DealTypeEnum'] = {

    /**
     * value: "Acquisition / Merger"
     * @const
     */
    "Acquisition / Merger": "Acquisition / Merger",

    /**
     * value: "Majority Stake"
     * @const
     */
    "Majority Stake": "Majority Stake",

    /**
     * value: "Minority Stake"
     * @const
     */
    "Minority Stake": "Minority Stake",

    /**
     * value: "Spinoff"
     * @const
     */
    "Spinoff": "Spinoff"
};


/**
 * Allowed values for the <code>sourceFunds</code> property.
 * @enum {String}
 * @readonly
 */
Detail['SourceFundsEnum'] = {

    /**
     * value: "Bank Loan"
     * @const
     */
    "Bank Loan": "Bank Loan",

    /**
     * value: "Bond/Note Issuance"
     * @const
     */
    "Bond/Note Issuance": "Bond/Note Issuance",

    /**
     * value: "Internally Generated Funds"
     * @const
     */
    "Internally Generated Funds": "Internally Generated Funds",

    /**
     * value: "Mezzanine"
     * @const
     */
    "Mezzanine": "Mezzanine",

    /**
     * value: "Private Company Debt"
     * @const
     */
    "Private Company Debt": "Private Company Debt",

    /**
     * value: "Private Equity/Venture Funding"
     * @const
     */
    "Private Equity/Venture Funding": "Private Equity/Venture Funding",

    /**
     * value: "Private Warrant Option"
     * @const
     */
    "Private Warrant Option": "Private Warrant Option",

    /**
     * value: "Source of Funding Not Disclosed"
     * @const
     */
    "Source of Funding Not Disclosed": "Source of Funding Not Disclosed",

    /**
     * value: "Stock Issuance: Pref & Com (Public)"
     * @const
     */
    "Stock Issuance: Pref &amp; Com (Public)": "Stock Issuance: Pref & Com (Public)"
};


/**
 * Allowed values for the <code>purpose</code> property.
 * @enum {String}
 * @readonly
 */
Detail['PurposeEnum'] = {

    /**
     * value: "Financial"
     * @const
     */
    "Financial": "Financial",

    /**
     * value: "Strategic"
     * @const
     */
    "Strategic": "Strategic"
};


/**
 * Allowed values for the <code>attitude</code> property.
 * @enum {String}
 * @readonly
 */
Detail['AttitudeEnum'] = {

    /**
     * value: "Friendly"
     * @const
     */
    "Friendly": "Friendly",

    /**
     * value: "Hostile"
     * @const
     */
    "Hostile": "Hostile",

    /**
     * value: "Neutral"
     * @const
     */
    "Neutral": "Neutral"
};



export default Detail;

