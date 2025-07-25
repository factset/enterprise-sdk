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
import Comment from './Comment';

/**
 * The IssueData model module.
 * @module model/IssueData
 */
class IssueData {
    /**
     * Constructs a new <code>IssueData</code>.
     * issue response
     * @alias module:model/IssueData
     */
    constructor() { 
        
        IssueData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>IssueData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/IssueData} obj Optional instance to populate.
     * @return {module:model/IssueData} The populated <code>IssueData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new IssueData();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('subject')) {
                obj['subject'] = ApiClient.convertToType(data['subject'], 'String');
            }
            if (data.hasOwnProperty('comments')) {
                obj['comments'] = ApiClient.convertToType(data['comments'], [Comment]);
            }
            if (data.hasOwnProperty('severity')) {
                obj['severity'] = ApiClient.convertToType(data['severity'], 'String');
            }
            if (data.hasOwnProperty('internalId')) {
                obj['internalId'] = ApiClient.convertToType(data['internalId'], 'Number');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
        }
        return obj;
    }


}

/**
 * generated issue id for Issue Tracker
 * @member {String} id
 */
IssueData.prototype['id'] = undefined;

/**
 * subject of Issue Tracker issue
 * @member {String} subject
 */
IssueData.prototype['subject'] = undefined;

/**
 * array of comments added to issue
 * @member {Array.<module:model/Comment>} comments
 */
IssueData.prototype['comments'] = undefined;

/**
 * severity of issue tracker ticket
 * @member {String} severity
 */
IssueData.prototype['severity'] = undefined;

/**
 * @member {Number} internalId
 */
IssueData.prototype['internalId'] = undefined;

/**
 * @member {module:model/IssueData.StatusEnum} status
 */
IssueData.prototype['status'] = undefined;





/**
 * Allowed values for the <code>status</code> property.
 * @enum {String}
 * @readonly
 */
IssueData['StatusEnum'] = {

    /**
     * value: "Closed"
     * @const
     */
    "Closed": "Closed",

    /**
     * value: "Received"
     * @const
     */
    "Received": "Received",

    /**
     * value: "In Progress"
     * @const
     */
    "In Progress": "In Progress"
};



export default IssueData;

