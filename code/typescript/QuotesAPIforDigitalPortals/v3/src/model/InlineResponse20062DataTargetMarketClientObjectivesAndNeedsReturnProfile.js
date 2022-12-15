/**
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfileGermany from './InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfileGermany';

/**
 * The InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile model module.
 * @module model/InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile
 */
class InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile {
    /**
     * Constructs a new <code>InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile</code>.
     * Indicates whether the investment product is suitable for investors with specific return profiles.
     * @alias module:model/InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile
     */
    constructor() { 
        
        InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile} obj Optional instance to populate.
     * @return {module:model/InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile} The populated <code>InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile();

            if (data.hasOwnProperty('preservation')) {
                obj['preservation'] = ApiClient.convertToType(data['preservation'], 'String');
            }
            if (data.hasOwnProperty('growth')) {
                obj['growth'] = ApiClient.convertToType(data['growth'], 'String');
            }
            if (data.hasOwnProperty('income')) {
                obj['income'] = ApiClient.convertToType(data['income'], 'String');
            }
            if (data.hasOwnProperty('financing')) {
                obj['financing'] = ApiClient.convertToType(data['financing'], 'String');
            }
            if (data.hasOwnProperty('hedging')) {
                obj['hedging'] = ApiClient.convertToType(data['hedging'], 'String');
            }
            if (data.hasOwnProperty('optionOrLeveraged')) {
                obj['optionOrLeveraged'] = ApiClient.convertToType(data['optionOrLeveraged'], 'String');
            }
            if (data.hasOwnProperty('other')) {
                obj['other'] = ApiClient.convertToType(data['other'], 'String');
            }
            if (data.hasOwnProperty('germany')) {
                obj['germany'] = InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfileGermany.constructFromObject(data['germany']);
            }
        }
        return obj;
    }


}

/**
 * Indicates whether the investment product is suitable for investors with the return profile \"preservation\".
 * @member {module:model/InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.PreservationEnum} preservation
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.prototype['preservation'] = undefined;

/**
 * Indicates whether the investment product is suitable for investors with the return profile \"growth\".
 * @member {module:model/InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.GrowthEnum} growth
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.prototype['growth'] = undefined;

/**
 * Indicates whether the investment product is suitable for investors with the return profile \"income\".
 * @member {module:model/InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.IncomeEnum} income
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.prototype['income'] = undefined;

/**
 * Indicates whether the investment product is suitable for investors with the return profile \"financing\".
 * @member {module:model/InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.FinancingEnum} financing
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.prototype['financing'] = undefined;

/**
 * Indicates whether the investment product is suitable for investors with the return profile \"hedging\".
 * @member {module:model/InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.HedgingEnum} hedging
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.prototype['hedging'] = undefined;

/**
 * Indicates whether the investment product is suitable for investors with the return profile \"leverage\".
 * @member {module:model/InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.OptionOrLeveragedEnum} optionOrLeveraged
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.prototype['optionOrLeveraged'] = undefined;

/**
 * Indicates whether the investment product is suitable for investors with the return profile \"other\".
 * @member {module:model/InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.OtherEnum} other
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.prototype['other'] = undefined;

/**
 * @member {module:model/InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfileGermany} germany
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.prototype['germany'] = undefined;





/**
 * Allowed values for the <code>preservation</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile['PreservationEnum'] = {

    /**
     * value: "yes"
     * @const
     */
    "yes": "yes",

    /**
     * value: "no"
     * @const
     */
    "no": "no",

    /**
     * value: "neutral"
     * @const
     */
    "neutral": "neutral",

    /**
     * value: "feedback"
     * @const
     */
    "feedback": "feedback"
};


/**
 * Allowed values for the <code>growth</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile['GrowthEnum'] = {

    /**
     * value: "yes"
     * @const
     */
    "yes": "yes",

    /**
     * value: "no"
     * @const
     */
    "no": "no",

    /**
     * value: "neutral"
     * @const
     */
    "neutral": "neutral",

    /**
     * value: "feedback"
     * @const
     */
    "feedback": "feedback"
};


/**
 * Allowed values for the <code>income</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile['IncomeEnum'] = {

    /**
     * value: "yes"
     * @const
     */
    "yes": "yes",

    /**
     * value: "no"
     * @const
     */
    "no": "no",

    /**
     * value: "neutral"
     * @const
     */
    "neutral": "neutral",

    /**
     * value: "feedback"
     * @const
     */
    "feedback": "feedback"
};


/**
 * Allowed values for the <code>financing</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile['FinancingEnum'] = {

    /**
     * value: "yes"
     * @const
     */
    "yes": "yes",

    /**
     * value: "no"
     * @const
     */
    "no": "no",

    /**
     * value: "neutral"
     * @const
     */
    "neutral": "neutral",

    /**
     * value: "feedback"
     * @const
     */
    "feedback": "feedback"
};


/**
 * Allowed values for the <code>hedging</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile['HedgingEnum'] = {

    /**
     * value: "yes"
     * @const
     */
    "yes": "yes",

    /**
     * value: "no"
     * @const
     */
    "no": "no",

    /**
     * value: "neutral"
     * @const
     */
    "neutral": "neutral",

    /**
     * value: "feedback"
     * @const
     */
    "feedback": "feedback"
};


/**
 * Allowed values for the <code>optionOrLeveraged</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile['OptionOrLeveragedEnum'] = {

    /**
     * value: "yes"
     * @const
     */
    "yes": "yes",

    /**
     * value: "no"
     * @const
     */
    "no": "no",

    /**
     * value: "neutral"
     * @const
     */
    "neutral": "neutral",

    /**
     * value: "feedback"
     * @const
     */
    "feedback": "feedback"
};


/**
 * Allowed values for the <code>other</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile['OtherEnum'] = {

    /**
     * value: "yes"
     * @const
     */
    "yes": "yes",

    /**
     * value: "no"
     * @const
     */
    "no": "no",

    /**
     * value: "neutral"
     * @const
     */
    "neutral": "neutral",

    /**
     * value: "feedback"
     * @const
     */
    "feedback": "feedback"
};



export default InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile;

