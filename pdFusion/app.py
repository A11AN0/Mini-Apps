import PyPDF2, glob, os

##1. PDF Fuser is initialized and declared
pdf_fuser = PyPDF2.PdfFileMerger(strict=False)

##2. Will go through each file in deposit_pdfs directory and append them to the pdf fuser object
os.chdir("deposit_pdfs")
for file in glob.glob("*.pdf"):
    single_pdf_doc = open(file, "rb")
    pdf_fuser.append(single_pdf_doc)

##3. Will then output the merged pdf into the merged_pdfs directory :)
pdf_fuser.write("../merged_pdfs/merged_doc.pdf")
print("All pdfs are merged, thanks for using pdFusion!")