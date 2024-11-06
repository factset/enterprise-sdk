# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.IssueTracker.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.IssueTracker.model.attachment import Attachment
from fds.sdk.IssueTracker.model.attachment_response import AttachmentResponse
from fds.sdk.IssueTracker.model.comment import Comment
from fds.sdk.IssueTracker.model.comment_request import CommentRequest
from fds.sdk.IssueTracker.model.comment_request_data import CommentRequestData
from fds.sdk.IssueTracker.model.error import Error
from fds.sdk.IssueTracker.model.error_response import ErrorResponse
from fds.sdk.IssueTracker.model.file_extension import FileExtension
from fds.sdk.IssueTracker.model.id_response import IdResponse
from fds.sdk.IssueTracker.model.id_response_data import IdResponseData
from fds.sdk.IssueTracker.model.issue import Issue
from fds.sdk.IssueTracker.model.issue_data import IssueData
from fds.sdk.IssueTracker.model.issue_request import IssueRequest
from fds.sdk.IssueTracker.model.issue_request_data import IssueRequestData
from fds.sdk.IssueTracker.model.update_issue_request import UpdateIssueRequest
from fds.sdk.IssueTracker.model.update_issue_request_data import UpdateIssueRequestData
