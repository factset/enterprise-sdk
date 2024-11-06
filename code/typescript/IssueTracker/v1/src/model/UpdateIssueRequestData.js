/**
 * Issue Tracker API
 * This API is used to file issues
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The UpdateIssueRequestData model module.
 * @module model/UpdateIssueRequestData
 */
class UpdateIssueRequestData {
    /**
     * Constructs a new <code>UpdateIssueRequestData</code>.
     * update request infomration for issue
     * @alias module:model/UpdateIssueRequestData
     */
    constructor() { 
        
        UpdateIssueRequestData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UpdateIssueRequestData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateIssueRequestData} obj Optional instance to populate.
     * @return {module:model/UpdateIssueRequestData} The populated <code>UpdateIssueRequestData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateIssueRequestData();

            if (data.hasOwnProperty('subject')) {
                obj['subject'] = ApiClient.convertToType(data['subject'], 'String');
            }
            if (data.hasOwnProperty('severity')) {
                obj['severity'] = ApiClient.convertToType(data['severity'], 'String');
            }
            if (data.hasOwnProperty('productId')) {
                obj['productId'] = ApiClient.convertToType(data['productId'], 'String');
            }
            if (data.hasOwnProperty('categoryId')) {
                obj['categoryId'] = ApiClient.convertToType(data['categoryId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * subject of ticket
 * @member {String} subject
 */
UpdateIssueRequestData.prototype['subject'] = undefined;

/**
 * severity of issue. Accepts Critical, High and Medium for severity.
 * @member {String} severity
 */
UpdateIssueRequestData.prototype['severity'] = undefined;

/**
 * ProductId that needs to be replaced
 * @member {String} productId
 */
UpdateIssueRequestData.prototype['productId'] = undefined;

/**
 * Category that needs to be replaced
 * @member {String} categoryId
 */
UpdateIssueRequestData.prototype['categoryId'] = undefined;






export default UpdateIssueRequestData;

