/**
 * FactSet Estimates
 * Gain access to 20+ years of comprehensive estimates and statistics of over 250+ estimated metrics, including financial statement items, product segments, geosegments, and industry metrics. FactSet's consensus estimates are aggregated from a wide base of over 800+ contributors and cover over 19,000 active companies across 90+ countries. Data returned can be accessed on the data frequencies based on quarterly, fiscal years, and calendar years. FactSet Estimates updates on a real time basis intraday (every 5 minutes). Updating times vary based on earning season vs. non-earning season but the goal is to have the data available to the client within a few hours that FactSet receives updated information. Often times updates times can be much faster as FactSet has always been known as one of the fastest estimate providers in the market. 
 *
 * The version of the OpenAPI document: 2.5.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The DetailRatings model module.
 * @module model/DetailRatings
 */
class DetailRatings {
    /**
     * Constructs a new <code>DetailRatings</code>.
     * @alias module:model/DetailRatings
     */
    constructor() { 
        
        DetailRatings.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DetailRatings</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DetailRatings} obj Optional instance to populate.
     * @return {module:model/DetailRatings} The populated <code>DetailRatings</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DetailRatings();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('estimateDate')) {
                obj['estimateDate'] = ApiClient.convertToType(data['estimateDate'], 'Date');
            }
            if (data.hasOwnProperty('analystId')) {
                obj['analystId'] = ApiClient.convertToType(data['analystId'], 'String');
            }
            if (data.hasOwnProperty('analystName')) {
                obj['analystName'] = ApiClient.convertToType(data['analystName'], 'String');
            }
            if (data.hasOwnProperty('brokerId')) {
                obj['brokerId'] = ApiClient.convertToType(data['brokerId'], 'String');
            }
            if (data.hasOwnProperty('brokerName')) {
                obj['brokerName'] = ApiClient.convertToType(data['brokerName'], 'String');
            }
            if (data.hasOwnProperty('ratingsNoteText')) {
                obj['ratingsNoteText'] = ApiClient.convertToType(data['ratingsNoteText'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('inputDateTime')) {
                obj['inputDateTime'] = ApiClient.convertToType(data['inputDateTime'], 'String');
            }
            if (data.hasOwnProperty('lastModifiedDate')) {
                obj['lastModifiedDate'] = ApiClient.convertToType(data['lastModifiedDate'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * @member {String} fsymId
 */
DetailRatings.prototype['fsymId'] = undefined;

/**
 * Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)
 * @member {Date} estimateDate
 */
DetailRatings.prototype['estimateDate'] = undefined;

/**
 * The FactSet Entity Identifier for the analyst making the estimate.
 * @member {String} analystId
 */
DetailRatings.prototype['analystId'] = undefined;

/**
 * The name of the analyst making the estimate.
 * @member {String} analystName
 */
DetailRatings.prototype['analystName'] = undefined;

/**
 * The FactSet Entity Identifier for the broker making the estimate.
 * @member {String} brokerId
 */
DetailRatings.prototype['brokerId'] = undefined;

/**
 * The name of the broker making the estimate.
 * @member {String} brokerName
 */
DetailRatings.prototype['brokerName'] = undefined;

/**
 * A textual representation of the analysts rating. Broker recommendations are divided into five main broad categories- **Buy, Overweight, Hold, Underweight, and Sell**.<p>Additional recommendations may be displayed for the below reasons -  * Without- A rating \"Without\" is displayed when a broker provides estimates but does not provide a rating. * Dropping- When a broker stops covering an equity, the recommendation will show \"Dropping.\" * Not Available- A broker may be \"Not Available\" due to outstanding circumstances with that particular security. Ratings are not displayed until a new rating is provided. * Most/Least- \"Most\" or \"Least\" favorable rating is displayed for top or bottom rating available for a particular security. 
 * @member {String} ratingsNoteText
 */
DetailRatings.prototype['ratingsNoteText'] = undefined;

/**
 * Identifier that was used for the request.
 * @member {String} requestId
 */
DetailRatings.prototype['requestId'] = undefined;

/**
 * Date and time when the data is available at the source.
 * @member {String} inputDateTime
 */
DetailRatings.prototype['inputDateTime'] = undefined;

/**
 * The date at which a broker provided an estimate that is a revision.
 * @member {Date} lastModifiedDate
 */
DetailRatings.prototype['lastModifiedDate'] = undefined;






export default DetailRatings;

