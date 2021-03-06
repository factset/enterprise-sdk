/**
 * FactSet Exchange Traded Funds API
 * FactSet ETF data feeds provide complete and accurate security, fund and reference data across the universe of exchange-traded products. Data is sourced from ETF providers across the globe and includes more than 100 unique data points, resulting in comprehensive coverage to help you evaluate and construct ETFs, analyze potential trades, and perform fund research.<p> FactSet Reference and Analytics data uses FactSet's FCS, which categorizes exchange-traded products using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund's prospectus and marketing materials. ETF exposure details are presented on successively granular levels-  category, then focus, and then niche.</p> <p>Moreover, FactSet ETF Reference data captures over 100 unique data points and provides market-specific data if you wish to solely focus on U.S., Canadian, Australian, New Zealand, Singapore, Hong Kong or European exchanges. All data points are grouped in one of two levels, either as a Fund or as a Listing. However, FactSet ETF Analytics data is primarily available for U.S.-domiciled ETFs. A subset of reference data items are provided for European-domiciled funds. For a full breakout of regional availability and history, see Formula Definitions and Calculations.</p> 
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
import Category from './Category';

/**
 * The EtfReferenceDataRequest model module.
 * @module model/EtfReferenceDataRequest
 */
class EtfReferenceDataRequest {
    /**
     * Constructs a new <code>EtfReferenceDataRequest</code>.
     * @alias module:model/EtfReferenceDataRequest
     * @param ids {Array.<String>} List of ETF identifiers.
     */
    constructor(ids) { 
        
        EtfReferenceDataRequest.initialize(this, ids);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, ids) { 
        obj['ids'] = ids;
    }

    /**
     * Constructs a <code>EtfReferenceDataRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EtfReferenceDataRequest} obj Optional instance to populate.
     * @return {module:model/EtfReferenceDataRequest} The populated <code>EtfReferenceDataRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EtfReferenceDataRequest();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
            if (data.hasOwnProperty('metrics')) {
                obj['metrics'] = ApiClient.convertToType(data['metrics'], ['String']);
            }
            if (data.hasOwnProperty('categories')) {
                obj['categories'] = ApiClient.convertToType(data['categories'], [Category]);
            }
        }
        return obj;
    }


}

/**
 * List of ETF identifiers.
 * @member {Array.<String>} ids
 */
EtfReferenceDataRequest.prototype['ids'] = undefined;

/**
 * List of data items for Exchange Traded Funds. To fetch a list of all available data items, use the **_/metrics** endpoint. 
 * @member {Array.<String>} metrics
 */
EtfReferenceDataRequest.prototype['metrics'] = undefined;

/**
 * Selects the ETF metrics by category -   |category|description|   |---|---|   |BENCHMARK_DETAILS|Details surrounding the underlying Benchmark Id and Segment Banchmark|   |CLASSIFICATION|FactSet Fund Classification Codes and Names, across Asset Class, Broad  Geography, Fund Categories, Focus, Niche, and more.|   |COSTS_FEES|Expenses and Fees such as capital gains, expense ratio, management fees, and more.|   |COUNTERPARTY|Credit and Swap Counterparty details|   |CREATE_REDEEM|Creation and Redemption Sizes|   |DESCRIPTIVE|General Descriptive information such as name, objectives, issuer details, launch dates, website, and more.|   |DISTRIBUTIONS|Dividend Dates, Dividend Treatmetns, Min/Max Cap Gains|   |DOCUMENTATION|Details surrounding reporting information.|   |GEARING|Leverage factors, inverse flags, and more.|   |HEDGE|Hedging Information|   |RISK|CIFSC Risk Ratings|   |SERVICE_PROVIDERS|Distributors, issuers, and Advisor details|   |STATUS|Actively Managed Flags|   |STRATEGY|Segment Codes, selection criteria, strategy codes, weighting schemes, and lending details.|   |STRUCTURE|ETF Type, backing codes, synthetic types, ucits compliance, legal structures, and more.|   |TAX|Tax Types, distribution takes, K1 Flags, and more.| 
 * @member {Array.<module:model/Category>} categories
 */
EtfReferenceDataRequest.prototype['categories'] = undefined;






export default EtfReferenceDataRequest;

