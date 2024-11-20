/**
 * FACTSET MERGERS AND ACQUISITIONS API
 * The FactSet Mergers and Acquisitions API provides access to key transactions and pricing metrics on over 60,000 globally traded deals. Reference a Global Universe of Mergers and Acquisitions (M&A) transactions where the target of the deal is a Publicly traded Company. Review premiums, multiples and fundamental data to gather insights on deals and create predictive models based on different deal characteristics.    Monetary values returned by this API are converted and represented in USD.    This API is allows a limit of 10 requests per second and a maximum of 10 concurrent requests. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The DealValue model module.
 * @module model/DealValue
 */
class DealValue {
    /**
     * Constructs a new <code>DealValue</code>.
     * Deal Value Object
     * @alias module:model/DealValue
     */
    constructor() { 
        
        DealValue.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DealValue</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DealValue} obj Optional instance to populate.
     * @return {module:model/DealValue} The populated <code>DealValue</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DealValue();

            if (data.hasOwnProperty('baseEquity')) {
                obj['baseEquity'] = ApiClient.convertToType(data['baseEquity'], 'Number');
            }
            if (data.hasOwnProperty('transactionValue')) {
                obj['transactionValue'] = ApiClient.convertToType(data['transactionValue'], 'Number');
            }
            if (data.hasOwnProperty('enterpriseValue')) {
                obj['enterpriseValue'] = ApiClient.convertToType(data['enterpriseValue'], 'Number');
            }
            if (data.hasOwnProperty('annOfferPriceShare')) {
                obj['annOfferPriceShare'] = ApiClient.convertToType(data['annOfferPriceShare'], 'Number');
            }
            if (data.hasOwnProperty('buyerExchangeRatio')) {
                obj['buyerExchangeRatio'] = ApiClient.convertToType(data['buyerExchangeRatio'], 'Number');
            }
            if (data.hasOwnProperty('targetExchangeRatio')) {
                obj['targetExchangeRatio'] = ApiClient.convertToType(data['targetExchangeRatio'], 'Number');
            }
            if (data.hasOwnProperty('cashShare')) {
                obj['cashShare'] = ApiClient.convertToType(data['cashShare'], 'Number');
            }
            if (data.hasOwnProperty('stockShare')) {
                obj['stockShare'] = ApiClient.convertToType(data['stockShare'], 'Number');
            }
            if (data.hasOwnProperty('choice')) {
                obj['choice'] = ApiClient.convertToType(data['choice'], 'Boolean');
            }
            if (data.hasOwnProperty('buyerSharesIssued')) {
                obj['buyerSharesIssued'] = ApiClient.convertToType(data['buyerSharesIssued'], 'Number');
            }
            if (data.hasOwnProperty('percentSought')) {
                obj['percentSought'] = ApiClient.convertToType(data['percentSought'], 'Number');
            }
            if (data.hasOwnProperty('sharesSought')) {
                obj['sharesSought'] = ApiClient.convertToType(data['sharesSought'], 'Number');
            }
            if (data.hasOwnProperty('sharesOwnedPrior')) {
                obj['sharesOwnedPrior'] = ApiClient.convertToType(data['sharesOwnedPrior'], 'Number');
            }
            if (data.hasOwnProperty('premium1Day')) {
                obj['premium1Day'] = ApiClient.convertToType(data['premium1Day'], 'Number');
            }
            if (data.hasOwnProperty('premium5Day')) {
                obj['premium5Day'] = ApiClient.convertToType(data['premium5Day'], 'Number');
            }
            if (data.hasOwnProperty('premium30Day')) {
                obj['premium30Day'] = ApiClient.convertToType(data['premium30Day'], 'Number');
            }
            if (data.hasOwnProperty('paymentMethod')) {
                obj['paymentMethod'] = ApiClient.convertToType(data['paymentMethod'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * The total value of cash and all other forms of payment made to the Target – commonly cash and/or stock, though the calculation can include other methods of payment (e.g., notes, convertible debt, preferred stock, etc.) if disclosed and calculable. In transactions where multiple forms of payment are being made (e.g., cash and stock), the individual consideration components are calculated separately and then summed to arrive at the total Base Equity Value (e.g., cash component + stock component). Amounts returned are in USD.
 * @member {Number} baseEquity
 */
DealValue.prototype['baseEquity'] = undefined;

/**
 * Base Equity Value plus the value of the target’s outstanding net debt (where applicable). The target's outstanding net debt is defined as the total amount of short and long term interest-bearing debt less any cash and cash equivalents. The target's outstanding net debt will only be included in the Transaction Value calculation if a.) the acquirer is seeking to own 100% of the target, b.) the target is a non-financial company; and c.) the target's outstanding net debt is publicly disclosed (or the acquirer publicly states it is assuming a specific amount of liabilities). Otherwise, Transaction Value will be equal to the amount paid for the portion of the target acquired (Base Equity Value) and will exclude the target's outstanding net debt. Amounts returned are in USD.
 * @member {Number} transactionValue
 */
DealValue.prototype['transactionValue'] = undefined;

/**
 * The full value of the business acquired, using % sought to determine the value of 100% of the business if less than 100% was sought in the transaction. Amounts returned are in USD.
 * @member {Number} enterpriseValue
 */
DealValue.prototype['enterpriseValue'] = undefined;

/**
 * The current price offered for each share of target stock (including all forms of consideration). In a transaction in which the acquirer has increased or decrease the price they are offering on a per share basis from their original offer price, this item will always reflect the most current price per share being offered. Amounts returned are in USD.
 * @member {Number} annOfferPriceShare
 */
DealValue.prototype['annOfferPriceShare'] = undefined;

/**
 * Number of shares being issued by the acquirer to the target. Applicable only if the acquirer is issuing stock in the transaction. For example, Express Scripts, Inc. acquired Medco Health Solutions, Inc. in April 2012 for $28.5 bil in cash and stock. Medco shareholders received $28.8 in cash and 0.81 Express Scripts shares for every share held. Here, Stock Exchange Ratio - Buyers Shares is 0.81.
 * @member {Number} buyerExchangeRatio
 */
DealValue.prototype['buyerExchangeRatio'] = undefined;

/**
 * Number of target shares the stock swap exchange ratio is based upon when the acquirer is issuing stock in the transaction. For example, Express Scripts, Inc. acquired Medco Health Solutions, Inc. in April 2012 for $28.5 bil in cash and stock. Medco shareholders received $28.8 in cash and 0.81 Express Scripts shares for every share held. Here, Stock Exchange Ratio - Target Shares is 1.
 * @member {Number} targetExchangeRatio
 */
DealValue.prototype['targetExchangeRatio'] = undefined;

/**
 * Portion of the current offer price per share to be paid in cash. For example, Pfizer acquired Wyeth in 2009 for $66.8 in cash and stock. Pfizer paid $50.19 per share, comprised of $33 in cash and 0.985 shares of Pfizer stock (representing $17.19 based upon Pfizer's last closing stock price of $17.45 prior to announcement). Here, the Price/Share - Cash ($) is 33. Amounts returned are in USD.
 * @member {Number} cashShare
 */
DealValue.prototype['cashShare'] = undefined;

/**
 * Portion of the current offer price per share to be paid in the acquirer's stock. For example, Pfizer acquired Wyeth in 2009 for $66.8 in cash and stock. Pfizer paid $50.19 per share, comprised of $33 in cash and 0.985 shares of Pfizer stock (representing $17.19 based upon Pfizer's last closing stock price of $17.45 prior to announcement). Here, the Price/Share - Stock ($) is 17.19. Amounts returned are in USD.
 * @member {Number} stockShare
 */
DealValue.prototype['stockShare'] = undefined;

/**
 * Indicates if the acquirer is offering the target shareholders a choice of considerations (which is almost always a choice between selecting cash only, stock only or a mixture of cash and stock) for the specified deal identifier.
 * @member {Boolean} choice
 */
DealValue.prototype['choice'] = undefined;

/**
 * The number of shares issued by the buyer to the target as part of the payment.
 * @member {Number} buyerSharesIssued
 */
DealValue.prototype['buyerSharesIssued'] = undefined;

/**
 * The percentage of the target company's stock sought by the acquirer at the time the transaction was publicly announced.
 * @member {Number} percentSought
 */
DealValue.prototype['percentSought'] = undefined;

/**
 * The number of shares of the target company's stock sought by the acquirer at the time the transaction was publicly announced.
 * @member {Number} sharesSought
 */
DealValue.prototype['sharesSought'] = undefined;

/**
 * The percent of the target company's shares owned by the buyer prior to the transaction.
 * @member {Number} sharesOwnedPrior
 */
DealValue.prototype['sharesOwnedPrior'] = undefined;

/**
 * The percentage difference between the price per share offered by the acquirer and the target's closing stock price 1 trading day prior to the announcement date. This data is only available if the target is a public company and the price/share is disclosed.
 * @member {Number} premium1Day
 */
DealValue.prototype['premium1Day'] = undefined;

/**
 * The percentage difference between the price per share offered by the acquirer and the target's closing stock price 5 trading days prior to the announcement date. This data is only available if the target is a public company and the price/share is disclosed.
 * @member {Number} premium5Day
 */
DealValue.prototype['premium5Day'] = undefined;

/**
 * The percentage difference between the price per share offered by the acquirer and the target's closing stock price 30 trading days prior to the announcement date. This data is only available if the target is a public company and the price/share is disclosed.
 * @member {Number} premium30Day
 */
DealValue.prototype['premium30Day'] = undefined;

/**
 * Payment method/structure used in the transaction, including cash, stock, combination, or debt.
 * @member {Array.<module:model/DealValue.PaymentMethodEnum>} paymentMethod
 */
DealValue.prototype['paymentMethod'] = undefined;





/**
 * Allowed values for the <code>paymentMethod</code> property.
 * @enum {String}
 * @readonly
 */
DealValue['PaymentMethodEnum'] = {

    /**
     * value: "Cash"
     * @const
     */
    "Cash": "Cash",

    /**
     * value: "Cash & Stock"
     * @const
     */
    "Cash &amp; Stock": "Cash & Stock",

    /**
     * value: "Convertible Preferred Stock"
     * @const
     */
    "Convertible Preferred Stock": "Convertible Preferred Stock",

    /**
     * value: "Debt"
     * @const
     */
    "Debt": "Debt",

    /**
     * value: "Notes"
     * @const
     */
    "Notes": "Notes",

    /**
     * value: "Other"
     * @const
     */
    "Other": "Other",

    /**
     * value: "Preferred Stock"
     * @const
     */
    "Preferred Stock": "Preferred Stock",

    /**
     * value: "Stock"
     * @const
     */
    "Stock": "Stock",

    /**
     * value: "Warrant / Options"
     * @const
     */
    "Warrant / Options": "Warrant / Options"
};



export default DealValue;

