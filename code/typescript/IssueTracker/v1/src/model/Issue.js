/**
 * Issue Tracker API
 * This API is used to file issues
 *
 * The version of the OpenAPI document: 1.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import IssueData from './IssueData';

/**
 * The Issue model module.
 * @module model/Issue
 */
class Issue {
    /**
     * Constructs a new <code>Issue</code>.
     * issue response
     * @alias module:model/Issue
     */
    constructor() { 
        
        Issue.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Issue</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Issue} obj Optional instance to populate.
     * @return {module:model/Issue} The populated <code>Issue</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Issue();

            if (data.hasOwnProperty('data')) {
                obj['data'] = IssueData.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/IssueData} data
 */
Issue.prototype['data'] = undefined;






export default Issue;

