/**
 * Stocks API For Digital Portals
 * The stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts: Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with potentially daily updates).  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the Bonds API and the Securitized Derivatives API for details.
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
import InlineResponse2001DataTargetPrice from './InlineResponse2001DataTargetPrice';
import InlineResponse2002Recommendation from './InlineResponse2002Recommendation';

/**
 * The InlineResponse2002Data model module.
 * @module model/InlineResponse2002Data
 */
class InlineResponse2002Data {
    /**
     * Constructs a new <code>InlineResponse2002Data</code>.
     * @alias module:model/InlineResponse2002Data
     */
    constructor() { 
        
        InlineResponse2002Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2002Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2002Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2002Data} The populated <code>InlineResponse2002Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2002Data();

            if (data.hasOwnProperty('snapshot')) {
                obj['snapshot'] = ApiClient.convertToType(data['snapshot'], 'String');
            }
            if (data.hasOwnProperty('targetPrice')) {
                obj['targetPrice'] = InlineResponse2001DataTargetPrice.constructFromObject(data['targetPrice']);
            }
            if (data.hasOwnProperty('recommendation')) {
                obj['recommendation'] = InlineResponse2002Recommendation.constructFromObject(data['recommendation']);
            }
        }
        return obj;
    }


}

/**
 * Identification of the historic snapshot for aggregated recommendations.
 * @member {module:model/InlineResponse2002Data.SnapshotEnum} snapshot
 */
InlineResponse2002Data.prototype['snapshot'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataTargetPrice} targetPrice
 */
InlineResponse2002Data.prototype['targetPrice'] = undefined;

/**
 * @member {module:model/InlineResponse2002Recommendation} recommendation
 */
InlineResponse2002Data.prototype['recommendation'] = undefined;





/**
 * Allowed values for the <code>snapshot</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse2002Data['SnapshotEnum'] = {

    /**
     * value: "latest"
     * @const
     */
    "latest": "latest",

    /**
     * value: "1w"
     * @const
     */
    "1w": "1w",

    /**
     * value: "1m"
     * @const
     */
    "1m": "1m",

    /**
     * value: "3m"
     * @const
     */
    "3m": "3m",

    /**
     * value: "6m"
     * @const
     */
    "6m": "6m",

    /**
     * value: "1y"
     * @const
     */
    "1y": "1y"
};



export default InlineResponse2002Data;

