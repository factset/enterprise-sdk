# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.FactSetMergersandAcquisitions.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.FactSetMergersandAcquisitions.model.deal_company import DealCompany
from fds.sdk.FactSetMergersandAcquisitions.model.deal_ids import DealIds
from fds.sdk.FactSetMergersandAcquisitions.model.deal_public import DealPublic
from fds.sdk.FactSetMergersandAcquisitions.model.deal_value import DealValue
from fds.sdk.FactSetMergersandAcquisitions.model.deals_public_request import DealsPublicRequest
from fds.sdk.FactSetMergersandAcquisitions.model.deals_public_request_body import DealsPublicRequestBody
from fds.sdk.FactSetMergersandAcquisitions.model.deals_public_response import DealsPublicResponse
from fds.sdk.FactSetMergersandAcquisitions.model.deals_request import DealsRequest
from fds.sdk.FactSetMergersandAcquisitions.model.deals_request_body import DealsRequestBody
from fds.sdk.FactSetMergersandAcquisitions.model.deals_response import DealsResponse
from fds.sdk.FactSetMergersandAcquisitions.model.detail import Detail
from fds.sdk.FactSetMergersandAcquisitions.model.details_request import DetailsRequest
from fds.sdk.FactSetMergersandAcquisitions.model.details_request_body import DetailsRequestBody
from fds.sdk.FactSetMergersandAcquisitions.model.details_response import DetailsResponse
from fds.sdk.FactSetMergersandAcquisitions.model.error_object import ErrorObject
from fds.sdk.FactSetMergersandAcquisitions.model.error_response import ErrorResponse
from fds.sdk.FactSetMergersandAcquisitions.model.ids import Ids
from fds.sdk.FactSetMergersandAcquisitions.model.participant import Participant
from fds.sdk.FactSetMergersandAcquisitions.model.status import Status
from fds.sdk.FactSetMergersandAcquisitions.model.target import Target
